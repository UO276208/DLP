package AST.statements;

import AST.MyAstNode;
import AST.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class If extends MyAstNode implements Statement{
    private List<Statement> bodyIf;
    private List<Statement> bodyElse;
    private Expression condition;

    public If(int row, int column, Expression condition, List<Statement> bodyIf, List<Statement> bodyElse) {
        super(row, column);
        this.bodyIf = new ArrayList<>(bodyIf);
        this.bodyElse = new ArrayList<>(bodyElse);
        this.condition = condition;
    }

    public If(int row, int column, Expression condition, Statement bodyIf, List<Statement> bodyElse) {
        super(row, column);
        this.bodyIf = new ArrayList<>();
        this.bodyIf.add(bodyIf);
        this.bodyElse = new ArrayList<>(bodyElse);
        this.condition = condition;
    }

    public void addElseStatement(Statement statement){
        bodyElse.add(statement);
    }

    public void addElseStatements(List<Statement> statements){
        bodyElse.addAll(statements);
    }

    public void addIfStatement(Statement statement){
        bodyIf.add(statement);
    }

    public void addIfStatements(List<Statement> statements){
        bodyIf.addAll(statements);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<Statement> getBodyIf() {
        return bodyIf;
    }

    public void setBodyIf(List<Statement> bodyIf) {
        this.bodyIf = bodyIf;
    }

    public List<Statement> getBodyElse() {
        return bodyElse;
    }

    public void setBodyElse(List<Statement> bodyElse) {
        this.bodyElse = bodyElse;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
