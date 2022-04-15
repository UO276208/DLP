package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class Not extends MyExpression implements Expression {
    private Expression expression;

    public Not(int row, int column, Expression expression) {
        super(row, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "!" + expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Expression getExpression() {
        return expression;
    }
}