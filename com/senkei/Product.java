package com.senkei;

public class Product extends Variable {

    private Variable x;
    private Variable y;

    public Product(Variable x, Variable y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String asString() {
        return x.asString() + "*" + y.asString();
    }

    @Override
    public double asValue() {
        return x.asValue() * y.asValue();
    }
}
