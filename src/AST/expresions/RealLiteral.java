package AST.expresions;

import AST.MyAstNode;

public class RealLiteral extends MyAstNode {
    private double value;

    public RealLiteral(int row, int column, double value) {
        super(row, column);
        this.value = value;
    }
}
