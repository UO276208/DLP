package AST.statements;

import AST.MyAstNode;
import AST.expresions.Expresion;

public class Assigment extends MyAstNode implements  Statement{
    private Expresion expresion;

    public Assigment(int row, int column,Expresion expresion){
        super(row, column);
        this.expresion = expresion;
    }
}
