package com.company;

import java.util.ArrayList;

public class Cart {

    public ArrayList<Product> products = new ArrayList<Product>();

    private double TotalPrice;

    public double CalculateTotalPrice() {
        TotalPrice = 0;

        for(int i = 0; i < products.size(); i++) {
            // System.out.println(products.get(i).getName());
            TotalPrice += products.get(i).getPrice();

        }

        return TotalPrice;
    }
}
