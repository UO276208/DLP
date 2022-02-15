package AST.expresions;

import AST.MyAstNode;

public class FieldAccess extends MyAstNode {
    private String right;
    private Expresion left;

    public FieldAccess(int row, int column, String right, Expresion left) {
        super(row, column);
        this.left = left;
        this.right = right;
    }
}
