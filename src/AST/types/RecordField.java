package AST.types;

import AST.MyAstNode;

public class RecordField extends MyAstNode {
    private String name;

    public RecordField(int row, int column,String name){
        super(row,column);
        this.name = name;
    }
}
