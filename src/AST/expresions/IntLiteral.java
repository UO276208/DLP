package AST.expresions;

import AST.MyAstNode;

public class IntLiteral extends MyAstNode {
    private  int value;

    public IntLiteral(int row, int column,int value) {
        super(row, column);

        this.value = value;
    }
}
