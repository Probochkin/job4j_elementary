package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class LogicNotTest {

    @Test
    public void whenIsEven() {
        Integer in = 2;
        boolean result = LogicNot.isEven(in);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotEven() {
        Integer in = 1;
        boolean result = LogicNot.notEven(in);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIsPositive() {
        Integer in = 1;
        boolean result = LogicNot.isPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotIsPositive() {
        Integer in = -1;
        boolean result = LogicNot.notPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotEvenAndPositive() {
        Integer in = 1;
        boolean result = LogicNot.notEvenAndPositive(in);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEvenOrNotPositive() {
        Integer in = 1;
        boolean result = LogicNot.evenOrNotPositive(in);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }
}