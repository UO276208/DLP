package visitor;

import AST.definitions.Definition;
import AST.definitions.FuncDefinition;
import AST.definitions.VarDefinition;
import AST.expressions.*;
import AST.program.Program;
import AST.statements.*;
import AST.types.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR>{

    @Override
    public TR visit(Program p, TP parameters) {
        for(Definition definiton:p.getDefinitions()){
            definiton.accept(this, parameters);
        }

        return null;
    }

    @Override
    public TR visit(FuncDefinition fD, TP parameters) {
        fD.getType().accept(this, parameters);

        for(Statement st:fD.getBody()){
            st.accept(this, parameters);
        }

        return null;
    }

    @Override
    public TR visit(VarDefinition vD, TP parameters) {
        vD.getType().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP parameters) {
        a.getLeft().accept(this, parameters);
        a.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(ArrayAccess a, TP parameters) {
        a.getLeft().accept(this, parameters);
        a.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(Cast c, TP parameters) {
        c.getExpression().accept(this, parameters);
        c.getType().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(CharLiteral c, TP parameters) {
        return null;
    }

    @Override
    public TR visit(Comparator c, TP parameters) {
        c.getLeft().accept(this, parameters);
        c.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(FieldAccess f, TP parameters) {
        f.getLeft().accept(this, parameters);
        f.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(FuncInvocation fI, TP parameters) {
        fI.getVar().accept(this, parameters);
        for(Expression exp:fI.getExpresions()){
            exp.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(IntLiteral i, TP parameters) {
        return null;
    }

    @Override
    public TR visit(LogicOperator l, TP parameters) {
        l.getLeft().accept(this, parameters);
        l.getRight().accept(this, parameters);

        return null;
    }

    @Override
    public TR visit(Not n, TP parameters) {
        n.getExpression().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(RealLiteral r, TP parameters) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus u, TP parameters) {
        u.getExpresion().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(Variable v, TP parameters) {
        return null;
    }

    @Override
    public TR visit(Assigment a, TP parameters) {
        a.getValue().accept(this, parameters);
        a.getVar().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(If i, TP parameters) {
        for(Statement st:i.getBodyIf()){
            st.accept(this, parameters);
        }

        for(Statement st:i.getBodyElse()){
            st.accept(this, parameters);
        }

        i.getCondition().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(Input i, TP parameters) {
        for(Expression exp:i.getExpressions()){
            exp.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(Print p, TP parameters) {
        for(Expression exp:p.getExpressions()){
            exp.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(Return r, TP parameters) {
        r.getReturnValue().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(While w, TP parameters) {
        w.getCondition().accept(this, parameters);

        for(Statement sta:w.getBody()){
            sta.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(ArrayType a, TP parameters) {
        a.getType().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(CharType c, TP parameters) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP parameters) {
        return null;
    }

    @Override
    public TR visit(FuncType f, TP parameters) {
        f.getReturnType().accept(this, parameters);

        for(VarDefinition vDef: f.getLocalsVars()){
            vDef.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(IntType i, TP parameters) {
        return null;
    }

    @Override
    public TR visit(RealType r, TP parameters) {
        return null;
    }

    @Override
    public TR visit(RecordField r, TP parameters) {
        r.getType().accept(this, parameters);
        return null;
    }

    @Override
    public TR visit(RecordType r, TP parameters) {
        for(RecordField field: r.getFields()){
            field.accept(this, parameters);
        }
        return null;
    }

    @Override
    public TR visit(VoidType v, TP parameters) {
        return null;
    }
}
