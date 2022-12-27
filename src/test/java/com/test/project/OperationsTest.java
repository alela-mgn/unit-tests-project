package com.test.project;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OperationsTest {

    private static final double DELTA = 1e-15;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void sum() {
        Operations operations = new Operations();
        int res = operations.sum(5, 4);
        Assert.assertEquals(9, res);
    }

    @Test
    public void sum1() {
        Operations operations = new Operations();
        int res1 = operations.sum(-4, 9);
        Assert.assertEquals(5, res1);

    }

    @Test
    public void sum2() {
        Operations operations = new Operations();
        int res2 = operations.sum(8, 0);
        Assert.assertEquals(8, res2);

    }

    @Test
    public void minus() {
        Operations operations = new Operations();
        int res = operations.minus(192, 156);
        Assert.assertEquals(36, res);

    }

    @Test
    public void minus1() {
        Operations operations = new Operations();
        int res1 = operations.minus(-4, 20);
        Assert.assertEquals(-24, res1);
    }

    @Test
    public void minus2() {
        Operations operations = new Operations();
        int res2 = operations.minus(-8, 0);
        Assert.assertEquals(-8, res2);
    }

    @Test
    public void multiply() {
        Operations operations = new Operations();
        int res = operations.multiply(10, 2);
        Assert.assertEquals(20, res);
    }

    @Test
    public void multiply1() {
        Operations operations = new Operations();
        int res1 = operations.multiply(-20, 3);
        Assert.assertEquals(-60, res1);
    }

    @Test
    public void multiply2() {
        Operations operations = new Operations();
        int res2 = operations.multiply(15, 0);
        Assert.assertEquals(0, res2);
    }

    @Test
    public void division() {
        Operations operations = new Operations();
        double res = operations.division(36, 6);
        Assert.assertEquals(6, res, DELTA);
    }

    @Test
    public void division1() {
        Operations operations = new Operations();
        double res1 = operations.division(-81, 9);
        Assert.assertEquals(-9, res1, DELTA);
    }

    @Test()
    public void division2() {
        Operations operations = new Operations();
        exceptionRule.expect(ArithmeticException.class);
        exceptionRule.expectMessage("/ by zero");
        operations.division(8, 0);
    }
}



