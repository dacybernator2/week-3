package com.storemodel.persons;

import java.util.Hashtable;
import java.util.Map;


public class Manager {
    private final String role = "MANAGER";


     private static String employeeList;
    // staff list
    Map<Integer, String > employee = new Hashtable<>() ;



    public void hire(int cashierId ,String name) {
        if (role.equals("MANAGER")) {
            employee.put(cashierId, name);
            employeeList = employee.keySet().toString();  // update employee list
//   format the value to remove [  ]
            employeeList = employeeList.substring(1,employeeList.length() -1) ;


        }
    }

    public void sacked (int cashierId ) {
       if (this.role.equals("MANAGER")) {
           employee.remove(cashierId) ;
           employeeList = employee.keySet().toString(); // update employee list
//   format the value to remove [  ]
           employeeList = employeeList.substring(1,employeeList.length() -1) ;



       }
    }

    public static String getEmployeeList() {
        return employeeList;
    }

}

