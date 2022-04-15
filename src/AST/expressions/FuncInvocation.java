package AST.expressions;

import AST.MyAstNode;
import AST.statements.Statement;
import visitor.Visitor;

import java.util.List;

public class FuncInvocation extends MyExpression implements Statement, Expression {
    private List<Expression> expresions;
    private Variable var;

    public FuncInvocation(int row, int column, List<Expression> expresions, Variable var) {
        super(row, column);
        this.expresions = expresions;
        this.var = var;
    }

    @Override
    public String toString() {
        String expresionss = "";
        for (int i = 0; i< expresions.size(); i++){
            expresionss += expresions.get(i) + ",";
        }

        if(expresions.size() > 0)
            expresionss = expresionss.substring(0,expresionss.length() -1);

        return var + "(" + expresionss + ")";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<Expression> getExpresions() {
        return expresions;
    }

    public Variable getVar() {
        return var;
    }
}