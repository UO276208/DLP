package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends MyAstNode implements  Statement{
    private List<Statement> body;
    private Expression condition;

    public While(int row, int column, List<Statement> body, Expression condition) {
        super(row, column);
        this.body = new ArrayList<>(body);
        this.condition = condition;
    }

    public While(int row, int column, Statement body, Expression condition) {
        super(row, column);
        this.body = new ArrayList<>();
        this.body.add(body);
        this.condition = condition;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
