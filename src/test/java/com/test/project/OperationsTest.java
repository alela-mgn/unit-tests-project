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
    public void checkSumReturnCorrectResult() {
        int result = operations.sum(5, 4);
        assertEquals(9, result);
    }

    @Test
    public void checkSumReturnCorrectResult1() {
        int result = operations.sum(-4, 9);
        assertEquals(5, result);
    }

    @Test
    public void checkSumReturnCorrectResult2() {
        int result = operations.sum(8, 0);
        assertEquals(8, result);
    }

    @Test
    public void checkMinusReturnCorrectResult() {
        int result = operations.minus(192, 156);
        assertEquals(36, result);
    }

    @Test
    public void checkMinusReturnCorrectResult1() {
        int result = operations.minus(-4, 20);
        assertEquals(-24, result);
    }

    @Test
    public void checkMinusReturnCorrectResult2() {
        int result = operations.minus(-8, 0);
        assertEquals(-8, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResult() {
        int result = operations.multiply(10, 2);
        assertEquals(20, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResult1() {
        int result = operations.multiply(-20, 3);
        assertEquals(-60, result);
    }

    @Test
    public void checkMultiplyReturnCorrectResult2() {
        int result = operations.multiply(15, 0);
        assertEquals(0, result);
    }

    @Test
    public void checkDivisionReturnCorrectResult() {
        double result = operations.division(36, 6);
        assertEquals(6, result, DELTA);
    }

    @Test
    public void checkDivisionReturnCorrectResult1() {
        double result = operations.division(-81, 9);
        assertEquals(-9, result, DELTA);
    }

    @Test()
    public void checkDivisionReturnCorrectResult2() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Деление на ноль запрещено!");

        operations.division(8, 0);
    }
}



