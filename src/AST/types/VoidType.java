package AST.types;

import AST.MyAstNode;

public class VoidType extends MyAstNode implements Type{
    public VoidType(int row, int column) {
        super(row, column);
    }
}
