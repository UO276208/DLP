package AST.expressions;

import AST.MyAstNode;

public abstract class MyExpression extends MyAstNode implements Expression{
    private boolean LValue;

    public MyExpression(int row, int column){
        super(row, column);
    }

    @Override
    public boolean getLValue(){
       return true;
    }
    @Override
    public void setLValue(boolean LValue){
        this.LValue = LValue;
    }
}
