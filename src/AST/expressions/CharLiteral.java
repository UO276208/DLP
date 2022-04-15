package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class CharLiteral extends MyExpression implements Expression {
    private char value;

    public CharLiteral(int row, int column, char value) {
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
