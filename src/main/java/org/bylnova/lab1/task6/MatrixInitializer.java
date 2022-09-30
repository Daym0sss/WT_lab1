package org.bylnova.lab1.task6;

import java.util.Random;

public class MatrixInitializer {
    private double[][] matrix;
    private double[] sequence;

    public void formMatrix() {
        int sequenceIndex = 0;
        int j = 0;

        initialize();

        for (int i = 0; i < matrix.length; i++) {
            for (j = 0, sequenceIndex = i; j < matrix[i].length; j++) {
                matrix[i][j] = sequence[sequenceIndex];
                sequenceIndex++;
                if (sequenceIndex >= sequence.length) {
                    sequenceIndex = 0;
                }
                System.out.printf("%7.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private void initialize() {
        Random random = new Random();

        int n = random.nextInt(5, 15);

        sequence = new double[n];
        matrix = new double[n][n];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = Math.random() * 50 - 25;
        }
    }
}
