package com.storemodel.persons;

import com.storemodel.storage.Product;

import java.util.HashMap;
import java.util.Map;

public class  Customer {
      Map<String, Integer> cart = new HashMap<>();


      // add goods to buy
   public void addToCart (String item , int amount) {

//        makes sure the customer can only buy what is available

       if ( Product.getStock().containsKey(item) ) {

           if ( Product.getStock().get(item) >= amount) {

               cart.put(item.toUpperCase(), amount);
               int newAmount = Product.getStock().get(item) - amount ;
//         updates the stock with current quantity
               Product.getStock().put(item,newAmount) ;

           } else {
               System.out.printf(
                       "Sorry the number of %s currently available is %d but you entered %d" ,item, Product.getStock().get(item) ,amount);
               return ;
           }
           if (Product.getStock().get(item) == 0 ) {
               System.out.println(" SORRY WE ARE OUT OF STOCK");

           }


       }

    }


}
