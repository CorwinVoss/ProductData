package com.company;

import com.company.Product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String productString = "java:Murach's Java Programming:57.50";
        ArrayList<Character> productCode = new ArrayList<Character>();
        ArrayList<Character> productDesc = new ArrayList<Character>();
        ArrayList<Character> productPrice = new ArrayList<Character>();
        ArrayList<Character> productCharArray = new ArrayList<Character>();
        Product product = new Product();
        for (int i = 0; i < productString.length(); i++){
            productCharArray.add(productString.charAt(i));
        }
        for (int i = 0; productCharArray.get(i) != ':'; i++) {
            productCode.add(productCharArray.get(i));
        }
        for (int i = productCode.size() + 1; productCharArray.get(i) != ':'; i++){
            productDesc.add(productCharArray.get(i));
        }
        for (int i = productCode.size() + productDesc.size() + 2; i != productCharArray.size(); i++){
            productPrice.add(productCharArray.get(i));
        }
        String productCodeString = productCode.toString().replaceAll(", ", "").replaceAll("]", "").replaceAll("\\[", "");
        product.setCode(productCodeString);
        String productDescString = productDesc.toString().replaceAll(", ", "").replaceAll("]", "").replaceAll("\\[", "");
        product.setDescription(productDescString);
        double price = Double.parseDouble(productPrice.toString().replaceAll(", ", "").replaceAll("]", "").replaceAll("\\[", ""));
        product.setPrice(price);

        //TODO: process productString and populate fields of product object
        
        System.out.println("Code:        " + product.getCode());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price:       " + product.getPriceFormatted());
    }    
}