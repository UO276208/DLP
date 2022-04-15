package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends MyAstNode implements Type{
    private List<RecordField> fields;

    public RecordType(int row, int column, List<RecordField> fields) {
        super(row, column);
        this.fields = new ArrayList<>(fields);
    }

    public RecordType() {
        this.fields = new ArrayList<RecordField>();
    }

    public void addFields(List<RecordField> fields){
        this.fields.addAll(fields);
    }

    public void setPosition(){
        super.setRow(fields.get(0).getLine());
        super.setColumn(fields.get(0).getColumn());
    }

    @Override
    public String toString() {
        String toString = "struct { \n";

        for (int i = 0; i< fields.size(); i++){
            toString += fields.get(i) + "\n";
        }

        return toString + "}";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public List<RecordField> getFields() {
        return fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }
}
