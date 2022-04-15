package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class RealLiteral extends MyExpression implements Expression{
    private double value;

    public RealLiteral(int row, int column, double value) {
        super(row, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return value +"";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
