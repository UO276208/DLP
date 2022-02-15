package AST.expresions;

import AST.MyAstNode;

public class UnaryMinus extends MyAstNode {
    private Expresion expresion;

    public UnaryMinus(int row, int column, Expresion expresion) {
        super(row, column);

        this.expresion = expresion;
    }
}