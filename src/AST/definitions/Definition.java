package AST.definitions;

import AST.AstNode;
import AST.types.Type;

public interface Definition extends AstNode {
    String getName();
    Type getType();
}
