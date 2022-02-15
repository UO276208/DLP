package AST;

import AST.expresions.Expresion;

public abstract class MyAstNode implements Expresion {
    private int row;
    private int column;

    public MyAstNode(int row, int column){
        this.column = column;
        this.row = row;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
