package visitor;


import AST.definitions.FuncDefinition;
import AST.definitions.VarDefinition;
import AST.expressions.Variable;
import AST.statements.Statement;
import AST.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{
    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition fD, Void parameters) {
        symbolTable.set();
        if (!symbolTable.insert(fD))
            new ErrorType(fD.getLine(), fD.getColumn(),
                    "Funtion: " + fD.getName() + " is already defined");
        fD.getType().accept(this, parameters);

        for(Statement st:fD.getBody()){
            st.accept(this, parameters);
        }

        return null;
    }

    @Override
    public Void visit(VarDefinition vD, Void parameters) {
        if (!symbolTable.insert(vD))
            new ErrorType(vD.getLine(), vD.getColumn(),
                    "Var: " + vD.getName() + " is already defined");

        vD.getType().accept(this, parameters);
        return null;
    }

    @Override
    public Void visit(Variable v, Void parameters) {
        if (symbolTable.find(v.getName()) == null){
            //crear definicion con tipo error y asignarsela
            v.setDefinition(new VarDefinition(v.getLine(), v.getColumn(), "",
                    new ErrorType(v.getLine(), v.getColumn(), "Var " + v.getName()  +" is not defined")));
        }

        return null;
    }
}
