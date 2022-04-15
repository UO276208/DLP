package AST.types;

import AST.MyAstNode;
import ErrorHandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends MyAstNode implements Type{
    private String message;

    public ErrorType(int row, int column, String message) {
        super(row, column);
        this.message = message;

        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    @Override
    public String toString() {
        return "Error: " + message;
    }
}
