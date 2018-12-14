package com.company;

import com.company.Product;

public class Main {

    public static void main(String[] args) {
        String productString = "java:Murach's Java Programming:57.50";

        Product product = new Product();

        System.out.println(productString);

        //TODO: process productString and populate fields of product object
        
        System.out.println("Code:        " + product.getCode());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price:       " + product.getPriceFormatted());
    }    
}