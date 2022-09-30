package org.bylnova.lab1.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InsertionAlgorithm {

    private double[] sequenceA;
    private double[] sequenceB;
    private double[] resultSequence;

    private List<Integer> placesForInsertion;

    public void printNewSequence() {
        formNewSequence();

        for (Integer place : placesForInsertion) {
            System.out.print(place + " ");
        }
    }

    private void formNewSequence() {
        int indexB = 0;
        int resultIndex = 0;
        int insertionIndex = 0;
        int indexA = 0;

        initialize();

        while (sequenceB[indexB] <= sequenceA[indexA]) {
            resultSequence[resultIndex] = sequenceB[indexB];
            resultIndex++;

            placesForInsertion.add(insertionIndex, resultIndex);
            insertionIndex++;

            if (indexB + 1 != sequenceB.length) {
                indexB++;
            }
        }

        for (indexA = 0; (indexA < sequenceA.length - 1)
                && (indexB != sequenceB.length); indexA++) {
            resultSequence[resultIndex] = sequenceA[indexA];
            resultIndex++;

            while ((sequenceB[indexB] >= sequenceA[indexA])
                    && (sequenceB[indexB] <= sequenceA[indexA + 1])) {
                resultSequence[resultIndex] = sequenceB[indexB];
                resultIndex++;

                placesForInsertion.add(insertionIndex, resultIndex);
                insertionIndex++;

                indexB++;
                if (indexB == sequenceB.length) {
                    break;
                }
            }
        }

        resultSequence[resultIndex] = sequenceA[indexA];
        resultIndex++;
        indexA++;

        while (indexB != sequenceB.length) {
            resultSequence[resultIndex] = sequenceB[indexB];
            resultIndex++;

            placesForInsertion.add(insertionIndex, resultIndex);
            insertionIndex++;

            indexB++;
        }

        while (indexA != sequenceA.length) {
            resultSequence[resultIndex] = sequenceA[indexA];
            resultIndex++;

            indexA++;
        }
    }

    private void initialize() {
        Random random = new Random();

        int n = random.nextInt(5, 30);
        int m = random.nextInt(5, 30);

        sequenceA = new double[n];
        sequenceB = new double[m];
        resultSequence = new double[n + m];
        placesForInsertion = new ArrayList<>();

        for (int i = 0; i < sequenceA.length; i++) {
            sequenceA[i] = Math.random() * 50 - 25;
        }

        for (int i = 0; i < sequenceB.length; i++) {
            sequenceB[i] = Math.random() * 50 - 25;
        }

        Arrays.sort(sequenceA);
        Arrays.sort(sequenceB);
    }
}
