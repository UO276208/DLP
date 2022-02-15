package AST.definitions;

import AST.MyAstNode;
import AST.types.Type;

public abstract class MyDefinition extends MyAstNode implements Definition{
    private String name;
    private Type type;

    public MyDefinition(int row, int column,String name, Type type){
        super(row, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
