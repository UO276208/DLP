package AST.types;

import AST.MyAstNode;
import AST.definitions.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class FuncType extends MyAstNode implements Type{
    private List<VarDefinition> localsVars;
    private Type returnType;

    public FuncType(int row, int column,List<VarDefinition> localsVars, Type returnType){
        super(row,column);
        this.localsVars = new ArrayList<>(localsVars);
        this.returnType = returnType;
    }
}
