package AST.expressions;

import visitor.Visitor;

public class ArrayAccess extends MyExpresionBinaryOperation{

    public ArrayAccess(int row, int column, Expression left, Expression right) {

        super(row, column, right, left);
    }

    @Override
    public String toString() {
        return super.getLeft() + "[" + super.getRight() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
