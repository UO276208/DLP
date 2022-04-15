package AST.expressions;

import AST.MyAstNode;

public abstract class MyExpresionBinaryOperation extends MyExpression implements Expression {
    private Expression right;
    private Expression left;

    public MyExpresionBinaryOperation(int row, int column, Expression right, Expression left) {
        super(row, column);
        this.right = right;
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }
}
