package com.example.justjava;

public class PriceBean {
    private Integer coffeePrice;
    private Integer whippedCreamPrice;
    private Integer chocolatePrice;

    public PriceBean() {
    }

    public PriceBean(Integer coffeePrice, Integer whippedCreamPrice, Integer chocolatePrice) {
        this.coffeePrice = coffeePrice;
        this.whippedCreamPrice = whippedCreamPrice;
        this.chocolatePrice = chocolatePrice;
    }

    public Integer getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(Integer coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public Integer getWhippedCreamPrice() {
        return whippedCreamPrice;
    }

    public void setWhippedCreamPrice(Integer whippedCreamPrice) {
        this.whippedCreamPrice = whippedCreamPrice;
    }

    public Integer getChocolatePrice() {
        return chocolatePrice;
    }

    public void setChocolatePrice(Integer chocolatePrice) {
        this.chocolatePrice = chocolatePrice;
    }
}
