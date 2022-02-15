package AST.statements;

import AST.MyAstNode;
import AST.expresions.Expresion;

public class Return extends MyAstNode implements Statement{
    private Expresion returnValue;

    public Return(int row, int column, Expresion returnValue) {
        super(row, column);
        this.returnValue = returnValue;
    }
}
