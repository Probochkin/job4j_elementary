package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(100, 500);
        plus(4, 2);
        plus(2, 6);
    }
}
