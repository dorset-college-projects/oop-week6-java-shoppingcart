package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Product p = new Product();
        p.setName("Apple");
        p.setPrice(.60);

        Product p1 = new Product();
        p1.setName("Orange");
        p1.setPrice(.25);

        Cart shoppingCart = new Cart();

        shoppingCart.products.add(p);
        shoppingCart.products.add(p1);
        shoppingCart.products.add(p1);
        shoppingCart.products.add(p1);
        shoppingCart.products.add(p1);
        shoppingCart.products.add(p);


        double TotalPrice = shoppingCart.CalculateTotalPrice();

        System.out.println(TotalPrice);

        shoppingCart.WriteCartToFile();

        shoppingCart.ReadCartFromFile();


    }
}
