package org.example;

abstract class Calculator {

    double num1;
    double num2;
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    abstract double calculate();
}

