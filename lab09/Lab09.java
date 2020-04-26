/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.*;

/**
 *
 * @author Anand
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        boolean b = false;
        
        // Read file
        System.out.println("Read file");
        CustomerList cl = CustomerList.read(new File("Customers.csv"));
        if(cl != null){
            System.out.println("Read: " + cl.size() + " records");
            System.out.println(cl.toString() + "\n\n\n");
        }
        else{
            System.out.println("File read error.");
            return;
        }

        // Test get and set for CustomerList
        System.out.println("Test get and set for CustomerList");
        System.out.println("x = " + cl.get(0));
        Customer c = cl.get(0);
        c.setFirstName("Homer");
        cl.set(c, 0);
        System.out.println("x = " + cl.get(0));
        System.out.println("\n\n\n");

        // Test indexOf and update 
        int i = cl.indexOf(55);
        System.out.println("Test indexOf and update");
        System.out.println("idx = " + cl.indexOf(34));
        System.out.println("Customer with id 35 = \n" + cl.get(cl.indexOf(35)));
        // Update an existing Customer
        b = cl.update(35, 100.0);
        if(b)
            System.out.println("Update successful");
        else
            System.out.println("Update not successful");
        System.out.println("Customer with id 35 = \n" + cl.get(cl.indexOf(35)));
        cl.update(41, 150.0);
        cl.update(59, 200.0);
        cl.update(72, 250.0);
        // Update a non-existing Customer
        b = cl.update(350, 100.0);
        if(b)
            System.out.println("Update successful");
        else
            System.out.println("Update not successful");
        System.out.println("\n\n\n");

        // Test remove
        System.out.println("Test remove");
        System.out.println("x = " + cl.get(1));
        // Remove an existing Customer
        c = cl.remove(1);
        if(c != null)
            System.out.println("Deleted\n" + c.toString());
        else
            System.out.println("No Customer deleted");
        // Remove an existing Customer
        c = cl.remove(101);
        if(c != null)
            System.out.println("Deleted\n" + c.toString());
        else
            System.out.println("No Customer deleted");
        System.out.println("\n\n\n");

        // Write file
        b = CustomerList.write(cl, new File("NewCustomers.csv"));
        if(b)
            System.out.println("File write successful");
        else
            System.out.println("File write failed");
    } 
}  
