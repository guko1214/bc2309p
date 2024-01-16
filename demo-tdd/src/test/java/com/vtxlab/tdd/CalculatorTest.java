package com.vtxlab.tdd;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*; //
import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertThat(calculator.add(10,3), is(13));
        assertThat(calculator.add(-2,3), is(1));
        assertThat(calculator.add(-2,-9), is(-11));
    }

}
