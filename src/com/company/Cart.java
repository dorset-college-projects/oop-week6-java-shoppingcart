package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    // https://www.w3schools.com/java/java_files_create.asp
    public void WriteCartToFile() {

        try {
            FileWriter myWriter = new FileWriter("shopping.txt");

            for(int i = 0; i < products.size(); i++) {
                // System.out.println(products.get(i).getName());
                myWriter.write(products.get(i).getName() + "\n");


            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("Cannot write to file");

        }

    }

    public double ReadCartFromFile() {
        products = new ArrayList<Product>();
        try {
            File myShoppingCartFile = new File("shopping.txt");
            Scanner myReader = new Scanner(myShoppingCartFile);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                // Can you create the cart and calculate total prices



            }

            myReader.close();
        }catch(FileNotFoundException e) {

            System.out.println("File not found");
        }

        return CalculateTotalPrice();

    }
}
