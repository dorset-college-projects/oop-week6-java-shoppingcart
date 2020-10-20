package com.company;

public class Pricing {
    double price ;

    public double getProductPrice(String item) {

        switch(item.toLowerCase()) {
            case "apple": price = .60; break;
            case "orange": price = .25; break;
            default:
                price = 1.00;
                break;

        }

        return price;

    }
}
