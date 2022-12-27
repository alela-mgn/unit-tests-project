package com.test.project;

public class Operations {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        return (double) num1 / num2;
    }
}


