package AST.types;

import AST.MyAstNode;

public class RealType extends MyAstNode implements Type{
    public RealType(int row, int column) {
        super(row, column);
    }
}
