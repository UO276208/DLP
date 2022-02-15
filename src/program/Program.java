package program;

import AST.definitions.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<Definition> definitions;

    public Program(List<Definition> definitions){
        this.definitions= new ArrayList<>(definitions);
    }
}
