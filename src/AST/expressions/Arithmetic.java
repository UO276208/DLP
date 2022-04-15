package AST.expressions;

import visitor.Visitor;

public class Arithmetic extends MyExpresionBinaryOperation{
    private String operator;


    public Arithmetic(int row, int column, String operator, Expression left, Expression right) {
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
