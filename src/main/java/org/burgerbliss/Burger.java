package org.burgerbliss;

public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String lettuce;
    private String tomato;
    private String sauce;
    private String jalapenos;

    public Burger(String bun, String patty, String cheese, String lettuce, String tomato, String sauce, String jalapenos) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.sauce = sauce;
        this.jalapenos = jalapenos;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese='" + cheese + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", sauce='" + sauce + '\'' +
                ", jalapenos='" + jalapenos + '\'' +
                '}';
    }
}

