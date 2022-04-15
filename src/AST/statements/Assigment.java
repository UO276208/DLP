package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

public class Assigment extends MyAstNode implements  Statement{
    private Expression var;
    private Expression value;

    public Assigment(int row, int column, Expression var, Expression value){
        super(row, column);
        this.var = var;
        this.value = value;
    }

    @Override
    public String toString() {
        return var + " = " + value + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Expression getVar() {
        return var;
    }

    public void setVar(Expression var) {
        this.var = var;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
