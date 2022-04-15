package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

public class RealType extends MyAstNode implements Type{
    public RealType(int row, int column) {
        super(row, column);
    }

    @Override
    public String toString() {
        return "double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
