package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class UnaryMinus extends MyExpression implements Expression{
    private Expression expresion;

    public UnaryMinus(int row, int column, Expression expresion) {
        super(row, column);

        this.expresion = expresion;
    }

    @Override
    public String toString() {
        return "-" + expresion;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Expression getExpresion() {
        return expresion;
    }
}