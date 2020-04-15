package com.senkei;

public abstract class Main implements ArithmeticExpression {


    public static void main(String args[]) {
        Variable x = new Variable("x",2.5);
        Variable y = new Variable("y",4);
        ArithmeticExpression exp = new Sum(x, new Product(y, new Sum(x,y)));
        ArithmeticExpression exp2 = new Sum(x, y);
        System.out.println(exp2.asString());
        System.out.println(exp2.asValue());

        System.out.println(exp.asString()); //(x+(y*(x+y)))
        System.out.println(exp.asValue()); //28.5
        x.set(5);
        System.out.println(exp.asValue()); //41.0
    }
}


