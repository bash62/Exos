package com.senkei;


public class Sum extends Variable {

    Variable x;
    Variable y;
    
    public Sum(Variable x, Variable y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String asString() {
        return x.asString() + "+" + y.asString();
    }

    @Override
    public double asValue() {
        return x.asValue()+y.asValue();
    }
}
