package AST.expressions;

import visitor.Visitor;

public class Comparator extends MyExpresionBinaryOperation implements Expression {
    private String comparator;

    public Comparator(int row, int column, Expression left, Expression right, String comparator) {
        super(row, column, right, left);
        this.comparator = comparator;
    }

    @Override
    public String toString() {
        return super.getLeft() + comparator + super.getRight();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
