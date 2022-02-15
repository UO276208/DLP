package AST.statements;

import AST.MyAstNode;
import AST.expresions.Expresion;

import java.util.ArrayList;
import java.util.List;

public class Imput extends MyAstNode implements Statement{
    private List<Expresion> expressions;

    public Imput(int row, int column, List<Expresion> expressions) {
        super(row, column);
        this.expressions = new ArrayList<>(expressions);
    }
}
