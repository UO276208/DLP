package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class FieldAccess extends MyExpression implements Expression {
    private Expression right;
    private Expression left;

    public FieldAccess(int row, int column, Expression left, Expression right) {
        super(row, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + "." + right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }
}
