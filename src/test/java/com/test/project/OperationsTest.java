package com.test.project;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    private static final double DELTA = 1e-15;

    private final Operations operations = new Operations();

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void checkSumReturnCorrectResultWithPositiveNumber() {
        int result = operations.sum(5, 4);
        assertEquals(9, result);
    }

    @Test
    public void checkSumReturnCorrectResultWithNegativeNumber() {
        int result = operations.sum(-4, 9);
        assertEquals(5, result);
    }

    @Test
    public void checkSumReturnCorrectResultWithZero() {
        int result = operations.sum(8, 0);
        assertEquals(8, result);
    }

    @Test
    public void checkMinusReturnCorrectResultWithPositiveNumber() {
        int result = operations.minus(192, 156);
        assertEquals(36, result);
    }

    @Test
    public void checkMinusReturnCorrectResultWithNegativeNumber() {
        int result = operations.minus(-4, 20);
        assertEquals(-24, result);
    }

    @Test
    public void checkMinusReturnCorrectResultWithZero() {
        int result = operations.minus(-8, 0);
        assertEquals(-8, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResultWithPositiveNumber() {
        int result = operations.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResultWithNegativeNumber() {
        int result = operations.multiply(-20, 3);
        assertEquals(-60, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResultWithZero() {
        int result = operations.multiply(15, 0);
        assertEquals(0, result);
    }

    @Test
    public void checkDivisionReturnCorrectResultWithPositiveNumber() {
        double result = operations.division(36, 6);
        assertEquals(6, result, DELTA);
    }

    @Test
    public void checkDivisionReturnCorrectResult1WithNegativeNumber() {
        double result = operations.division(-81, 9);
        assertEquals(-9, result, DELTA);
    }

    @Test()
    public void checkExceptionIsThrownWhenDivideByZeroPerformed() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Деление на ноль запрещено!");

        operations.division(8, 0);
    }
}



