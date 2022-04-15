package AST.program;

import AST.AstNode;
import AST.MyAstNode;
import AST.definitions.Definition;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends MyAstNode {
    private List<Definition> definitions;

    public Program(List<Definition> definitions){
        super(0,0);
        this.definitions= new ArrayList<>(definitions);
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }
}
