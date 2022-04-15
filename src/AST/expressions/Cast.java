package AST.expressions;

import AST.MyAstNode;
import AST.types.Type;
import visitor.Visitor;

public class Cast extends MyExpression implements Expression{
    private Type type;
    private Expression expression;

    public Cast(int row, int column, Type type, Expression expression) {
        super(row, column);
        this.type = type;
        this.expression = expression;

    }

    @Override
    public String toString() {
        return "(" + type + ")" + expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Type getType() {
        return type;
    }

    public Expression getExpression() {
        return expression;
    }
}
