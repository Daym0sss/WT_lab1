package org.bylnova.lab1.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
    public double getBallWeight() {
        return balls.stream().mapToDouble(ball -> ball.getWeight()).sum();
    }
    public long getBallCountByColor(Colour colour) {
        return balls.stream()
                .filter(ball -> ball.getColour().equals(Colour.BLUE))
                .count();
    }
}
