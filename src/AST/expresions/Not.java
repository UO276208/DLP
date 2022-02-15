package AST.expresions;

import AST.MyAstNode;

public class Not extends MyAstNode {
    private Expresion expresion;

    public Not(int row, int column, Expresion exprexion) {
        super(row, column);
        this.expresion = exprexion;
    }
}