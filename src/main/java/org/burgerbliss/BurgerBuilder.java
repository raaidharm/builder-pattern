package org.burgerbliss;

public class BurgerBuilder {
    private String bun;
    private String patty;
    private String cheese;
    private String lettuce;
    private String tomato;
    private String sauce;
    private String jalapenos;

    public BurgerBuilder withBun(String bun) {
        this.bun = bun;
        return this;
    }

    public BurgerBuilder withPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder withLettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder withTomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public BurgerBuilder withJalapenos(String jalapenos) {
        this.jalapenos = jalapenos;
        return this;
    }

    public Burger makeBurger(){
        return new Burger(bun, patty, cheese, lettuce, tomato, sauce, jalapenos);
    }
}
