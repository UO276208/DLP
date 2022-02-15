package AST.definitions;

import AST.statements.Statement;
import AST.types.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends MyDefinition{
    private List<Statement> statemens;

    public FuncDefinition(int row, int column,String name, Type type, List<Statement> statemens){
        super(row, column, name, type);
        this.statemens = new ArrayList<>(statemens);
    }
}
