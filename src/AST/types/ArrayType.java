package AST.types;

import AST.MyAstNode;

public class ArrayType extends MyAstNode implements Type{
    private Type type;
    private int size;

    public ArrayType(int row, int column,Type type, int size){
        super(row, column);
        this.size = size;
        this.type = type;
    }
}
