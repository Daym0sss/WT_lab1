package org.bylnova.lab1.task9;

public class Task9Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        fillBasket(basket);
        System.out.printf("%4.2f\n", basket.getBallWeight());

        System.out.println(basket.getBallCountByColor(Colour.BLUE));
    }

    public static void fillBasket(Basket basket) {
        basket.addBall(new Ball(Math.random() * 20, Colour.BLACK));
        basket.addBall(new Ball(Math.random() * 20, Colour.BLUE));
        basket.addBall(new Ball(Math.random() * 20, Colour.BLUE));
        basket.addBall(new Ball(Math.random() * 20, Colour.YELLOW));
    }
}
