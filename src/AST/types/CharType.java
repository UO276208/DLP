package AST.types;

import AST.MyAstNode;

public class CharType extends MyAstNode implements Type{
    public CharType(int row, int column) {
        super(row, column);
    }
}
