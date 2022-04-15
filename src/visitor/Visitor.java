package visitor;

import AST.definitions.FuncDefinition;
import AST.definitions.VarDefinition;
import AST.expressions.*;
import AST.program.Program;
import AST.statements.*;
import AST.types.*;

public interface Visitor<TP, TR> {
    TR visit(Program p, TP parameters);
    TR visit(FuncDefinition fD, TP parameters);
    TR visit(VarDefinition vD, TP parameters);
    TR visit(Arithmetic a, TP parameters);
    TR visit(ArrayAccess a, TP parameters);
    TR visit(Cast c, TP parameters);
    TR visit(CharLiteral c, TP parameters);
    TR visit(Comparator c, TP parameters);
    TR visit(FieldAccess f, TP parameters);
    TR visit(FuncInvocation fI, TP parameters);
    TR visit(IntLiteral i, TP parameters);
    TR visit(LogicOperator l, TP parameters);
    TR visit(Not n, TP parameters);
    TR visit(RealLiteral r, TP parameters);
    TR visit(UnaryMinus u, TP parameters);
    TR visit(Variable v, TP parameters);
    TR visit(Assigment a, TP parameters);
    TR visit(If i, TP parameters);
    TR visit(Input i, TP parameters);
    TR visit(Print p, TP parameters);
    TR visit(Return r, TP parameters);
    TR visit(While w, TP parameters);
    TR visit(ArrayType a, TP parameters);
    TR visit(CharType c, TP parameters);
    TR visit(ErrorType e, TP parameters);
    TR visit(FuncType f, TP parameters);
    TR visit(IntType i, TP parameters);
    TR visit(RealType r, TP parameters);
    TR visit(RecordField r, TP parameters);
    TR visit(RecordType r, TP parameters);
    TR visit(VoidType v, TP parameters);
}
