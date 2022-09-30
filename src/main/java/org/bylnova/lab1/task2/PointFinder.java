package org.bylnova.lab1.task2;

import java.util.Random;

public class PointFinder {

    public boolean isPointValid() {
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        return ((x >= -4 && x <= 4 && y >= 0 && y <= 5)
                || (x >= -6 && x <= 6 && y >= -3 && y <= 0));
    }
}
