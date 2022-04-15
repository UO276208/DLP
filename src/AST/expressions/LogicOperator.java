package AST.expressions;

import visitor.Visitor;

public class LogicOperator extends MyExpresionBinaryOperation{
    private String operator;

    public LogicOperator(int row, int column, Expression left, Expression right, String operator) {
        super(row, column, right, left);
        this.operator = operator;
    }

    @Override
    public String toString() {
        return super.getLeft() + operator + super.getRight();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
