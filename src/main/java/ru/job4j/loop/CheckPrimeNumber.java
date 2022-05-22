package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime;
        if (number == 1) {
            prime = false;
        } else {
            prime = true;
        }
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    prime = false;
                    break;
                }

            }

        return prime;
    }
}
