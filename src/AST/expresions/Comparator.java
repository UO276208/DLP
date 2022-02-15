package AST.expresions;

public class Comparator extends MyExpresionBinaryOperation{
    private String comparator;

    public Comparator(int row, int column, Expresion right, Expresion left, String comparator) {
        super(row, column, right, left);
        this.comparator = comparator;
    }
}
