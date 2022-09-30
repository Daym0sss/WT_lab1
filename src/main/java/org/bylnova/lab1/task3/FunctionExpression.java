package org.bylnova.lab1.task3;

public class FunctionExpression {
    private double a;
    private double b;
    private double h;

    public void printResult() {
        double epsilon = 0.001;

        getValues();
        for (double i = a; Math.abs(i - b) < epsilon || i < b; i += h) {
            System.out.printf("%3f  %3f\n", i, Math.tan(i));
        }
    }

    private void getValues() {
        double x;
        a = Math.random() * 100 - 50;
        b = Math.random() * 100 - 50;
        h = Math.random() * 30 - 15;
        if (a > b) {
            x = b;
            b = a;
            a = x;
        }
    }
}
