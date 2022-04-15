package AST.expressions;

import AST.MyAstNode;
import AST.definitions.Definition;
import visitor.Visitor;

public class Variable extends MyExpression implements Expression{
    private String name;
    private Definition definition;

    public Variable(int row, int column, String name){
     super(row, column);
     this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }
}
