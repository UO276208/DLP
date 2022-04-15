package AST.types;

import AST.MyAstNode;
import AST.definitions.VarDefinition;
import AST.statements.Statement;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncType extends MyAstNode implements Type{
    private List<VarDefinition> localsVars;
    private Type returnType;

    public FuncType(int row, int column, List<VarDefinition> localsVars,
                    Type returnType){
        super(row,column);
        this.localsVars = new ArrayList<>(localsVars);
        this.returnType = returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<VarDefinition> getLocalsVars() {
        return localsVars;
    }

    public void setLocalsVars(List<VarDefinition> localsVars) {
        this.localsVars = localsVars;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
