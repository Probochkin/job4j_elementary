package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay() {
        String in = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
         in = "Saturday";
         expected = 6;
         result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
        in = "No";
        expected = -1;
        result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
    }
}