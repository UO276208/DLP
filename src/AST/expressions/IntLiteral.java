package AST.expressions;

import AST.MyAstNode;
import visitor.Visitor;

public class IntLiteral extends MyExpression implements Expression {
    private  int value;

    public IntLiteral(int row, int column,int value) {
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
