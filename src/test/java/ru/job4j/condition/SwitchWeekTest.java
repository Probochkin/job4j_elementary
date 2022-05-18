package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void wherename1Then() {
        Integer in = 1;
        String expected = "Понедельник";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename2Then() {
        Integer in = 2;
        String expected = "Вторник";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename3Then() {
        Integer in = 3;
        String expected = "Среда";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename4Then() {
        Integer in = 4;
        String expected = "Четверг";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename5Then() {
        Integer in = 5;
        String expected = "Пятница";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename6Then() {
        Integer in = 6;
        String expected = "Суббота";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename7Then() {
        Integer in = 7;
        String expected = "Воскресенье";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wherename9Then() {
        Integer in = 9;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(result, expected);
    }
}