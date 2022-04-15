package AST.definitions;

import AST.AstNode;
import AST.expressions.Variable;
import AST.types.Type;

public interface Definition extends AstNode {
    String getName();
    Type getType();
    void setScope(int scope);
    int getScope();
}
