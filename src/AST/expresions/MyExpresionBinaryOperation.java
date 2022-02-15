package AST.expresions;

import AST.MyAstNode;

public abstract class MyExpresionBinaryOperation extends MyAstNode {
    private Expresion right;
    private Expresion left;

    public MyExpresionBinaryOperation(int row, int column, Expresion right, Expresion left) {
        super(row, column);
        this.right = right;
        this.left = left;
    }
}
