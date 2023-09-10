package com.storemodel.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Product {


    private static final Map<String, Integer> stock = new HashMap<>();
    private static final  Map<String , Double > stockPrice = new HashMap<>() ;

    public Product () throws FileNotFoundException {
        String csvFile = "/Users/DACYBERNATOR/Documents/DECAJECT/storemodel_2/storage/product.csv" ;
        String csvSplitBy = "," ;
        File file = new File(csvFile) ;
        Scanner scanner = new Scanner(file) ;


        double price ;
        int amount ;
        String item ;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[]  values = line.split(csvSplitBy) ;
            item = values[0] ;
            price = Double.parseDouble(values[1]);
           amount = Integer.parseInt(values[2]);

 //makes sure the file is in correct format
            if ( values.length != 3 ){
                System.out.println("THE FILE CONTAINS BAD FORMATTING FOR ENTRIES");
                return;
            }else {
                stock.put(item.toUpperCase(), amount) ;
                stockPrice.put(item.toUpperCase(), price) ;
            }
        }
        scanner.close();
    }


    // who updates the product

    public static Map<String, Double> getStockPrice() { return stockPrice; }

    public static Map<String, Integer> getStock() {
        return stock;

    }


}
