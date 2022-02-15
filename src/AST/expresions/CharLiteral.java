package AST.expresions;

import AST.MyAstNode;

public class CharLiteral extends MyAstNode {
    private char value;

    public CharLiteral(int row, int column, char value) {
        super(row, column);
        this.value = value;
    }
}
