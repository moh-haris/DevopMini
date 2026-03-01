package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFactorial() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, Main.factorial(0));
    }

    @Test
    void testSqrt() {
        assertEquals(4.0, Math.sqrt(16));
    }

    @Test
    void testPower() {
        assertEquals(8.0, Math.pow(2,3));
    }
}