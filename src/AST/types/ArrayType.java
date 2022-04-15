package AST.types;

import AST.MyAstNode;
import visitor.Visitor;

public class ArrayType extends MyAstNode implements Type{
    private Type type;
    private int size;

    public ArrayType(int row, int column,Type type, int size){
        super(row, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        visitor.visit(this, parameters);
        return null;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
