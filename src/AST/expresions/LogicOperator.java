package AST.expresions;

public class LogicOperator extends MyExpresionBinaryOperation{
    private String operator;

    public LogicOperator(int row, int column, Expresion right, Expresion left, String operator) {
        super(row, column, right, left);
        this.operator = operator;
    }
}
