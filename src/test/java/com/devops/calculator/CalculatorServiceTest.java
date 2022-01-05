package com.devops.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(15, new CalculatorService().Add(10, 5).getResult());
    }
    @Test
    public void testsub() {
        assertEquals(15, new CalculatorService().sub(10, 5).getResult());
    }
    @Test
    public void testmul() {
        assertEquals(15, new CalculatorService().mul=l(10, 5).getResult());
    }
    @Test
    public void testdiv() {
        assertEquals(15, new CalculatorService().div(10, 5).getResult());
    }
}
