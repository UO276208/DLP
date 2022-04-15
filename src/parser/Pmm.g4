grammar Pmm;	

@header
{
import AST.program.*;
import AST.definitions.*;
import AST.expressions.*;
import AST.statements.*;
import AST.types.*;
}

program returns[Program ast] locals[List<Definition> aux]:
        {$aux = new ArrayList<>();}
        (definition {$aux.addAll($definition.ast);})* main_function {$aux.add($main_function.ast);} EOF
        {$ast = new Program($aux);}
        ;
/*program returns [Definition ast]: definition { $ast = $definition.ast;};*/

expression returns [Expression ast]:
        INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(),
                        $INT_CONSTANT.getCharPositionInLine() +1,
                        LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        |REAL_CONSTANT {$ast = new RealLiteral($REAL_CONSTANT.getLine(),
                                              $REAL_CONSTANT.getCharPositionInLine() +1,
                                              LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        |CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(),
                                                                    $CHAR_CONSTANT.getCharPositionInLine() +1,
                                                                    LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        |ID {$ast = new Variable( $ID.getLine(),  $ID.getCharPositionInLine() +1, $ID.text); }
        |'(' op=expression ')' {$ast = $op.ast;}
        |op1=expression '[' op2=expression ']' {$ast = new ArrayAccess($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast, $op2.ast);}
        |function_invocation {$ast = $function_invocation.ast;}
        |op1=expression '.' op2=expression {$ast = new FieldAccess($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast, $op2.ast);}
        |cast {$ast = $cast.ast;}
        |'-'op=expression {$ast = new UnaryMinus($op.ast.getLine(), $op.ast.getColumn(), $op.ast);}
        |'!'op=expression {$ast = new Not($op.ast.getLine(), $op.ast.getColumn(), $op.ast);}
        |op1=expression OP=('*'|'/'|'%') op2=expression
                {$ast = new Arithmetic($op1.ast.getLine(), $op1.ast.getColumn(), $OP.text, $op1.ast, $op2.ast); }
        |op1=expression OP=('+'|'-') op2=expression {$ast = new Arithmetic($op1.ast.getLine(),
                $op1.ast.getColumn(), $OP.text, $op1.ast, $op2.ast); }
        |op1=expression OP=('>'|'>='|'<'|'<='|'!='|'==') op2=expression
            {$ast = new LogicOperator($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text); }
        |op1=expression OP=('&&'|'||') op2=expression
        {$ast = new Comparator($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text); }
       ;

function_invocation returns[FuncInvocation ast]:
        ID'('var_coma_list1')' {$ast = new FuncInvocation($ID.getLine(),
                $ID.getCharPositionInLine() +1, $var_coma_list1.ast,
                new Variable( $ID.getLine(),  $ID.getCharPositionInLine() +1, $ID.text));}
;

type returns[Type ast]:
    simple_type {$ast = $simple_type.ast;}
    |record_type {$ast = $record_type.ast;}
     |'['INT_CONSTANT']' type {$ast = new ArrayType($type.ast.getLine(), $type.ast.getColumn(), $type.ast,
        LexerHelper.lexemeToInt($INT_CONSTANT.text));}
     ;

record_type returns[RecordType ast]:
        {$ast = new RecordType();} 'struct''{' (record_field{$ast.addFields($record_field.ast);})+ '}'
        {$ast.setPosition();}
;

record_field returns[List<RecordField> ast = new ArrayList()] locals[ErrorType e]:
    id_list':'type';' {
        for(int i = 0; i<$id_list.ast.size();i++){
            if($ast.contains($id_list.ast.get(i))){
                    $e = new ErrorType($id_list.ast.get(i).getLine(), $id_list.ast.get(i).getColumn(),
                            "RecordField" + $id_list.ast.get(i).toString() + "is already defined");
            }else{
                $ast.add(new RecordField($id_list.ast.get(i).getLine(),
                     $id_list.ast.get(i).getColumn(), $id_list.ast.get(i).toString(), $type.ast));
                }
        }
    }
;
id_list returns[List<Variable> ast = new ArrayList()]:
        ID1=ID{$ast.add(new Variable( $ID1.getLine(),
        $ID1.getCharPositionInLine() +1,
        $ID1.text));}
        (','ID2=ID {$ast.add(new Variable( $ID2.getLine(),
                           $ID2.getCharPositionInLine() +1,
                           $ID2.text));})*;

simple_type returns [Type ast]:
            TYPE='int' {$ast = new IntType($TYPE.getLine()
                    , $TYPE.getCharPositionInLine() +1);}
            |TYPE='double' {$ast = new RealType($TYPE.getLine()
                                               , $TYPE.getCharPositionInLine() +1);}
            |TYPE='char' {$ast = new CharType($TYPE.getLine()
                                             , $TYPE.getCharPositionInLine() +1);}
            ;

cast returns [Cast ast]:
    '('simple_type ')' expression {$ast = new Cast($simple_type.ast.getLine()
                , $simple_type.ast.getColumn(), $simple_type.ast, $expression.ast);}
    ;

statement returns [Statement ast]:
            'return' expression ';' {$ast = new Return($expression.ast.getLine()
                    , $expression.ast.getColumn(), $expression.ast);}
            |op1=expression '=' op2=expression';' {$ast = new Assigment($op1.ast.getLine()
                                           , $op1.ast.getColumn(), $op1.ast ,$op2.ast);}
            |if_ {$ast = $if_.ast;}
            |while_ {$ast = $while_.ast;}
            | 'input' var_coma_list2 ';' {$ast = new Input($var_coma_list2.ast.get(0).getLine(),
                              $var_coma_list2.ast.get(0).getColumn(),$var_coma_list2.ast);}
            |'print' var_coma_list2';' {$ast = new Print($var_coma_list2.ast.get(0).getLine(),
                    $var_coma_list2.ast.get(0).getColumn(),$var_coma_list2.ast);}
            |function_invocation ';' {$ast = $function_invocation.ast;}
            ;

var_coma_list2 returns[List<Expression> ast = new ArrayList<>()]:
    op1=expression {$ast.add($op1.ast);} (','op2=expression {$ast.add($op2.ast);})*
   ;

var_coma_list1 returns[List<Expression> ast = new ArrayList<>()]:
    (op1=expression{ $ast.add($op1.ast);}
    (','op2=expression {$ast.add($op2.ast);})*)?
;

body_plus returns[List<Statement> ast = new ArrayList<>()]:
        '{' (statement{$ast.add($statement.ast);})+ '}'
;

while_ returns[While ast]:
        'while' expression ':' body_plus {
            $ast = new While($expression.ast.getLine()
                 ,$expression.ast.getColumn(), $body_plus.ast, $expression.ast);}
        |'while' expression ':' statement{
            $ast = new While($expression.ast.getLine()
                  ,$expression.ast.getColumn(), $statement.ast, $expression.ast);}
;

if_ returns[If ast] locals[List<Statement> elseAux = new ArrayList<Statement>()]:
    'if' expression ':' body_plus (else_ {$elseAux = $else_.ast;})?
        {$ast = new If($expression.ast.getLine()
                             ,$expression.ast.getColumn(), $expression.ast, $body_plus.ast, $elseAux);}
    |'if' expression ':' statement (else_ {$elseAux = $else_.ast;})?
        {$ast = new If($expression.ast.getLine()
                                 ,$expression.ast.getColumn(), $expression.ast, $statement.ast, $elseAux);}
;

else_ returns[List<Statement> ast = new ArrayList<>()]:
        'else' body_plus {$ast.addAll($body_plus.ast);}
        | 'else' statement {$ast.add($statement.ast);}
;

definition returns[List<Definition> ast = new ArrayList<>()] locals[List<VarDefinition> parameters,
                                List<Statement> body, Type typeAux]:
            var_definition ';' {$ast.addAll($var_definition.ast);}
            |{
              $body = new ArrayList<>();
              $parameters = new ArrayList<>();
              $typeAux = new VoidType(0,0);
            }
            'def' ID '(' ((va1=var_definition','{
            $parameters.addAll($va1.ast);})* va2=var_definition {$parameters.addAll($va2.ast);})? ')' ':'
            (type{$typeAux = $type.ast;})? '{'(va3=var_definition{$body.addAll($va3.ast);}
             ';')* (statement {$body.add($statement.ast);})*'}'
             {$ast.add(new FuncDefinition($ID.getLine(),  $ID.getCharPositionInLine() +1, $ID.text,
                                    new FuncType(0, 0, $parameters, $typeAux), $body));}
;

main_function returns[FuncDefinition ast] locals[List<Statement> body]:
        {
            $body = new ArrayList<>();
        }

        'def' 'main' '('')' ':' '{'(var_definition{$body.addAll($var_definition.ast);} ';')*
        (statement {$body.add($statement.ast);})*'}'
        {$ast = new FuncDefinition(0,  0, "main",
                     new FuncType(0, 0, new ArrayList<VarDefinition>(), new VoidType(0,0)), $body);}
;

var_definition returns[List<VarDefinition> ast = new ArrayList<>()] locals[ErrorType e]:
        id_list':'type
        {
                for(int i = 0; i<$id_list.ast.size();i++){
                    if($ast.contains($id_list.ast.get(i))){
                        $e = new ErrorType($id_list.ast.get(i).getLine(), $id_list.ast.get(i).getColumn(),
                                "Var" + $id_list.ast.get(i).toString() + "is already defined");
                    }else{
                        $ast.add(new VarDefinition($id_list.ast.get(i).getLine(),
                                         $id_list.ast.get(i).getColumn(), $id_list.ast.get(i).toString(), $type.ast));
                        }
                }
            }
;

fragment
DIGIT: [0-9];
fragment
CARACTER: [a-zA-Z];
fragment
MANTISA: [Ee] [+-]? [1-9] DIGIT*;

INT_CONSTANT: '0' | [1-9] DIGIT*;
REAL_CONSTANT: ([1-9] DIGIT*? MANTISA) | (DIGIT*?'.' DIGIT* [1-9] MANTISA?) | (DIGIT*? '.');
ID: (CARACTER | '_') ('_' | CARACTER | DIGIT)*;
CHAR_CONSTANT: '\'' (( '\\' DIGIT DIGIT DIGIT) | '\\n' | '\\t' | .) '\'';
COMMENTARIO: '#' .*? ('\r')?('\n'|EOF) -> skip;
COMENTARIO_MULTILINEA: '"""' .*? '"""' -> skip;
TRASH: [ \n\r\t] -> skip;