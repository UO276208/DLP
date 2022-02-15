package AST.expresions;

public class ArrayAccess extends MyExpresionBinaryOperation{

    public ArrayAccess(int row, int column, Expresion left, Expresion right) {
        super(row, column, right, left);
    }
}
