package AST.expressions;

import AST.AstNode;

public interface Expression extends AstNode {
    boolean getLValue();
    void setLValue(boolean LValue);
}