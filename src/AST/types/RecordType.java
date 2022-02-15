package AST.types;

import AST.MyAstNode;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends MyAstNode implements Type{
    private List<RecordField> fiels;

    public RecordType(int row, int column, List<RecordField> fiels) {
        super(row, column);
        this.fiels = new ArrayList<>(fiels);
    }
}
