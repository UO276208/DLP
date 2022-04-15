package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Print extends MyAstNode implements Statement{
    private List<Expression> expressions;

    public Print(int row, int column, List<Expression> expressions) {
        super(row, column);
        this.expressions = new ArrayList<>(expressions);
    }

    @Override
    public String toString() {
        String toString = "print ";

        for (int i = 0; i< expressions.size(); i++){
            toString += expressions.get(i) + ",";
        }

        if(expressions.size() > 0)
            toString = toString.substring(0,toString.length() -1);

        return toString + ";";
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
