package org.bylnova.lab1.task1;

public class ExpressionSolution {

    public double getResult() {
        double x = Math.random() * 100 - 50;
        double y = Math.random() * 100 - 50;
        return solveEquation(x, y);
    }

    private double solveEquation(double x, double y) {
        return ((1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)))) + x;
    }
}
