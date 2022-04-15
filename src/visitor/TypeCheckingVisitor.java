package visitor;

import AST.expressions.*;
import AST.statements.Assigment;
import AST.types.ErrorType;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void>{
    @Override
    public Void visit(Assigment a, Void parameters) {
        a.getValue().accept(this, parameters);
        a.getVar().accept(this, parameters);
        if(!a.getVar().getLValue())
            new ErrorType(a.getVar().getLine() ,a.getVar().getColumn(),
                    "Left expression is not an LValue");

        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void parameters) {
        a.setLValue(false);
        a.getLeft().accept(this, parameters);
        a.getRight().accept(this, parameters);

        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void parameters) {
        a.setLValue(true);

        a.getLeft().accept(this, parameters);
        a.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(Cast c, Void parameters) {
        c.setLValue(false);

        c.getExpression().accept(this, parameters);
        c.getType().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Void parameters) {
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparator c, Void parameters) {
        c.setLValue(false);
        c.getLeft().accept(this, parameters);
        c.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void parameters) {
        f.setLValue(true);

        f.getLeft().accept(this, parameters);
        f.getRight().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(FuncInvocation fI, Void parameters) {
        fI.setLValue(false);
        fI.getVar().accept(this, parameters);
        for(Expression exp:fI.getExpresions()){
            exp.accept(this, parameters);
        }
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void parameters) {
        i.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LogicOperator l, Void parameters) {
        l.setLValue(false);

        l.getLeft().accept(this, parameters);
        l.getRight().accept(this, parameters);

        return null;
    }

    @Override
    public Void visit(Not n, Void parameters) {
        n.setLValue(false);

        n.getExpression().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(RealLiteral r, Void parameters) {
        r.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Void parameters) {
        u.setLValue(false);

        u.getExpresion().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(Variable v, Void parameters) {
        v.setLValue(true);
        return null;
    }
}
