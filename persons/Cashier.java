package com.storemodel.persons;


import com.storemodel.storage.Product;



public class Cashier{

     private int cashierId ;



    public void sellProducts ( int cashierId, Customer checkOut ) {
               this.cashierId = cashierId ;
//  prevent printing when the cat is empty
        if ( Manager.getEmployeeList().equalsIgnoreCase(String.valueOf(this.cashierId))  && !checkOut.cart.values().isEmpty()) {


//  cashier  calculate and  print receipt
            double total  = 0;
            System.out.println("-------------Receipt---------");
            for (String item : checkOut.cart.keySet()) {
                int amount = checkOut.cart.get(item) ;
                double charge = Product.getStockPrice().get(item) ;
                double price  = amount * charge ;
                 total = total + price ;

                System.out.println( item + "----------- " + charge);

            }
            System.out.println("-------------Receipt---------");
            System.out.println("=======TOTAL==="+":  "+ total );

          //  cart.customerOrders().forEach((k,v) -> System.out.println("Company: "+ k + ", Net worth: " + v));



        }


    }


}
