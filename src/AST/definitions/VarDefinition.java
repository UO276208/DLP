package AST.definitions;

import AST.types.Type;

public class VarDefinition extends MyDefinition{
    public VarDefinition(int row, int column,String name, Type type) {
        super(row, column, name, type);
    }
}
