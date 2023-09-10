package com.storemodel.executable;

import com.storemodel.persons.Cashier;
import com.storemodel.persons.Customer;
import com.storemodel.persons.Manager;
import com.storemodel.storage.Product;

import java.io.FileNotFoundException;


public class MainStore {
    public static void main(String[] args) throws FileNotFoundException {
//      Creating of the Manager
        Manager  boss = new Manager ();



//      employment  of the cashier
        boss.hire (2023, "Ebuka");
        boss.hire (45, "Chidi") ;

//      termination of cashier
        boss.sacked (45)  ;

 //   initialise products
//        internally initialised
//----------------------------------------------------
        Product goods = new Product() ;

// deploy cashier
        Cashier Paschal  = new Cashier() ;

//  customer can buy goods
        Customer Ebuka = new Customer() ;
//        Ebuka.addToCart("BLACK_SOUP", 1);
//        Ebuka.addToCart("BEANS", 2);
//

        // CASHIER CAN SELL GOODS
    Paschal.sellProducts(2023,Ebuka);









    }

}
