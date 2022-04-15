package AST.definitions;

import AST.expressions.Variable;
import AST.statements.Statement;
import AST.types.Type;
import visitor.Visitor;

import java.util.Objects;

public class VarDefinition extends MyDefinition implements Statement {
    public VarDefinition(int row, int column, String name, Type type) {

        super(row, column, name, type);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Definition obj2 = (Definition) obj;

        return obj2.getName().equals(getName());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
