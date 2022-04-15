package AST.definitions;

import AST.expressions.Variable;
import AST.statements.Statement;
import AST.types.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends MyDefinition{
    private List<Statement> body;

    public FuncDefinition(int row, int column, String name
            ,Type type, List<Statement> body){
        super(row, column, name, type);
        this.body = new ArrayList<>(body);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<Statement> getBody() {
        return body;
    }
}
