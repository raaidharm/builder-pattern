package org.burgerbliss;

public class BurgerBliss {
    public static void main(String[] args) {
        // Without Builder Pattern
        // Burger burgerOne = new Burger("sesame", "beef", "cheddar", "lettuce", "tomato", "mayo", "jalapenos");

        //With Builder Pattern
        Burger burgerOne = new BurgerBuilder()
                .withBun("sesame")
                .withPatty("beef")
                .withCheese("cheddar")
                .makeBurger();
        System.out.println(burgerOne.toString());
    }
}