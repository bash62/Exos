package com.senkei;

public class Variable implements ArithmeticExpression{

    private String valueString;
    private double value;

    public Variable(String valueString, double value){
        this.valueString = valueString;
        this.value = value;
    }

    public Variable() {
        
    }

    public void set(double val){
        this.value = val;
    }



    @Override
    public String asString() {
        return this.valueString;
    }

    @Override
    public double asValue() {
        return this.value;
    }
}
