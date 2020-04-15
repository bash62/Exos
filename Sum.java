package com.senkei;


public class Sum  implements ArithmeticExpression{

    private Variable x;
    private ArithmeticExpression y;

    public Sum(Variable x, ArithmeticExpression y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String asString() {
        return String.format("%s + %s",this.x.asString(),this.y.asString());
    }

    @Override
    public double asValue() {
        return  (x.asValue() + y.asValue()) ;
    }
}
