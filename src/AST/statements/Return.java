package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

public class Return extends MyAstNode implements Statement{
    private Expression returnValue;

    public Return(int row, int column, Expression returnValue) {
        super(row, column);
        this.returnValue = returnValue;
    }

    @Override
    public String toString() {
        return "return " + returnValue + ";";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Expression getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Expression returnValue) {
        this.returnValue = returnValue;
    }
}
