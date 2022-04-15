package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

public class VoidType extends MyAstNode implements Type{
    public VoidType(int row, int column) {
        super(row, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
