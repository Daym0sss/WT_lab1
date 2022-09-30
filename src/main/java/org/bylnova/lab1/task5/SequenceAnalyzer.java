package org.bylnova.lab1.task5;

import java.util.Random;

public class SequenceAnalyzer {
    private int[] sequence;

    public int getK() {
        int temp;
        int result = 0;

        initialize();

        temp = sequence[0];
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] < temp) {
                result++;
            } else {
                temp = sequence[i];
            }
        }
        return result;
    }

    private void initialize() {
        Random random = new Random();

        int n = random.nextInt(10, 30);
        sequence = new int[n];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextInt(1000);
        }
    }
}
