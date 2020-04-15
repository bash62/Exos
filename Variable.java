package com.senkei;

public class Variable implements ArithmeticExpression{

    private static String axe;
    private static double pos;

    public Variable(String x,double pos){
        this.axe = x;
        this.pos = pos;
    }

    public void set(double val){
        this.pos = val;
    }

    public void setAxe(String s){
        this.axe = s;

    }
    public double getpos(){
        return this.pos;
    }

    public String getAxe(){
        return this.axe;
    }

    @Override
    public String asString() {
        return getAxe();
    }

    @Override
    public double asValue() {
        return getpos();
    }
}
