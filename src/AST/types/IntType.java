package AST.types;

import AST.MyAstNode;

public class IntType extends MyAstNode implements Type{
    public IntType(int row, int column) {
        super(row, column);
    }
}
