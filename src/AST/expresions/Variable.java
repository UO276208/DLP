package AST.expresions;

import AST.MyAstNode;

public class Variable extends MyAstNode {
    private String name;

    public Variable(int row, int column, String name){
     super(row, column);
     this.name = name;
    }

    public String getName() {
        return name;
    }
}
