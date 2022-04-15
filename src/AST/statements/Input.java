package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Input extends MyAstNode implements Statement{
    private List<Expression> expressions;

    public Input(int row, int column, List<Expression> expressions) {
        super(row, column);
        this.expressions = new ArrayList<>(expressions);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
