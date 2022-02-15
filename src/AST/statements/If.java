package AST.statements;

import AST.MyAstNode;
import AST.expresions.Expresion;

public class If extends MyAstNode implements Statement{
    private Expresion bodyIf;
    private Expresion bodyElse;
    private boolean condition;

    public If(int row, int column, Expresion bodyIf, Expresion bodyElse, boolean condition) {
        super(row, column);
        this.bodyElse = bodyElse;
        this.bodyIf = bodyIf;
        this.condition = condition;
    }
}
