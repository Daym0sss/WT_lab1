package org.bylnova.lab1.task7;

import java.util.Random;

public class SortingAlgorithm {
    private double[] array;

    public void sortArray() {
        double temp;
        double epsilon = 0.001;

        initialize();

        for (int i = 0; i < array.length - 1; ) {
            if ((array[i+1] > array[i])
            || (Math.abs(array[i+1] - array[i]) < epsilon)) {
                i++;
            } else {
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }

    private void initialize() {
        Random random = new Random();

        int n = random.nextInt(20, 30);
        array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 50 - 25;
        }
    }
}
