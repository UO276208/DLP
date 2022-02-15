package AST.statements;

import AST.MyAstNode;
import AST.expresions.Expresion;

public class While extends MyAstNode implements  Statement{
    private Expresion body;
    private boolean condition;

    public While(int row, int column, Expresion body, boolean condition) {
        super(row, column);
        this.body = body;
        this.condition = condition;
    }
}
