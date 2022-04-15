package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

public class CharType extends MyAstNode implements Type{
    public CharType(int row, int column) {
        super(row, column);
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
