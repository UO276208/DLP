package AST.expresions;

import AST.MyAstNode;
import AST.statements.Statement;

public class FuncInvocation extends MyAstNode implements Statement {
    private Expresion expresion;
    private Variable var;

    public FuncInvocation(int row, int column, Expresion expresion, Variable var) {
        super(row, column);
        this.expresion = expresion;
        this.var = var;
    }
}