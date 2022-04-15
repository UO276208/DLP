package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

public class IntType extends MyAstNode implements Type{
    public IntType(int row, int column) {
        super(row, column);
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
