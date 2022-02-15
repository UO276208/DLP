package AST.expresions;

public class Arithmetic extends MyExpresionBinaryOperation{
    private String operator;


    public Arithmetic(int row, int column, String operator, Expresion right, Expresion left) {
        super(row, column, right, left);
        this.operator = operator;
    }
}
