package org.bylnova.lab1.task4;

import java.util.Random;

public class PrimeNumberFinder {
    private int[] numbers;

    public void printPrimes() {
        initialize();
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void initialize() {
        Random random = new Random();

        int n = random.nextInt(10, 30);
        numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
    }
}
