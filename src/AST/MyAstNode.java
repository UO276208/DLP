package AST;

public abstract class MyAstNode implements AstNode {
    private int row;
    private int column;

    public MyAstNode(int row, int column){
        this.column = column;
        this.row = row;
    }

    public MyAstNode(){}

    @Override
    public int getLine() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
