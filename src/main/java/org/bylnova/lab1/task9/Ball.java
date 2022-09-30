package org.bylnova.lab1.task9;

public class Ball {
    private double weight;
    private Colour colour;

    public Ball(double weight, Colour colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }
}
