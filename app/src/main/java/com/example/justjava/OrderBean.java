package com.example.justjava;

import java.util.Locale;

public class OrderBean {
    private String name;
    private Integer quantity;
    private Boolean whippedCream;
    private Boolean chocolate;
    private Integer totalPrice;

    public OrderBean(String name, Integer quantity, Boolean whippedCream, Boolean chocolate, Integer totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.whippedCream = whippedCream;
        this.chocolate = chocolate;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(Boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public Boolean getChocolate() {
        return chocolate;
    }

    public void setChocolate(Boolean chocolate) {
        this.chocolate = chocolate;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return String.format(Locale.getDefault(),
                "Name:%s\n" +
                        "Add Whipped Cream?%b\n" +
                        "Add Chocolate?%b\n" +
                        "Quantity: %d\n" +
                        "Total: %d\n",
                name, whippedCream, chocolate, quantity, totalPrice);
    }
}
