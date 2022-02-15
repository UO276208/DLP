package AST.expresions;

import AST.MyAstNode;
import AST.types.Type;

public class Cast extends MyAstNode {
    private Type type;

    public Cast(int row, int column, Type type) {
        super(row, column);
        this.type = type;
    }
}
