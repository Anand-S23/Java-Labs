/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Anand
 */
public class CustomerList {
    private Customer [] customers; 
    private int size; 
    
    // constructor makes an array of customers of size 4
    public CustomerList() {
        customers = new Customer[4];
    }
    
    // returns the size of the list
    public int size() {
        return size;
    }
    
    // returns element i if in bound else null
    public Customer get(int i) {
        if (i < size){
            return customers[i];
        }
        return null;
    }
    
    // sets element i to c, returns true if in bounds else false
    public boolean set(Customer c, int i) {
        if (i < size) {
            customers[i] = c;
            return true;
        }
        return false;
    }
    
    // adds customer c to end of list, if list is full resizes 
    public void add(Customer c) {
        if (customers.length == size) {
            Customer [] temp = new Customer[customers.length*2];
            for (int i = 0; i < customers.length; ++i) {
                temp[i] = customers[i];
            }
            customers = temp; 
        }
        customers[size] = c;
        size++;
    }
    
    // Binaray search for ID, return index if found else returns -1
    public int indexOf(int ID){
        int right, left, center;
        this.sort(); // needs to be sorted for binary search

        left = 0;
        right = this.size - 1;

        while(left <= right)
        {
            center = (right + left) / 2;
            if (Integer.parseInt(this.get(center).getCustomerID()) > ID) {
                right = center - 1;
            }
            else if (Integer.parseInt(this.get(center).getCustomerID()) < ID) {
                left = center + 1;
            }
            else {
                return center;
            }
        }

        return -1;
    }
    
    // updates the grossSales by adding the amt, if ID exisits
    public boolean update(int ID, double amt){
        int index = this.indexOf(ID);
        if (index != -1) {
            double grsSale = Double.parseDouble(this.get(index).getGrossSales());
            grsSale += amt; 
            String finalGrsSale = String.valueOf(grsSale);
            this.get(index).setGrossSales(finalGrsSale);
            return true;
        }
        else {
            System.out.println("Not found.");
        }
        return false;
    }
    
    // selection sort on the customer list
    public void sort() {
        for (int i = 0; i < this.size-1; ++i) {      
            int smallest = i;
                    
            for (int j = i+1; j < this.size; ++j) {
                if (Integer.parseInt(this.get(j).getCustomerID()) < 
                        Integer.parseInt(this.get(smallest).getCustomerID())) {
                    smallest = j;
                }
            }
            
            Customer temp = this.get(i);
            this.set(this.get(smallest), i);
            this.set(temp, smallest);
        }
    }
    
    // removes customer at i and returns the customer if in bound else null
    public Customer remove(int i) {
        if (i < size) {
            Customer c = customers[i];
            size--;
            for (int j = i; j < size; ++j) {
                customers[j] = customers[j+1];
            }
            return c;
        }
        return null;
    }
    
    // reads from csv and adds to list
    public static CustomerList read(File fn) {
        CustomerList cl = new CustomerList();
        
        try {
            Scanner input = new Scanner(fn); 
            input.nextLine(); // for file header
            
            while (input.hasNextLine()) {
                String csv = input.nextLine();
                Customer c = new Customer(csv);
                cl.add(c);
            } 
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        }
        
        return cl;
    }
    
    // writes the customer in cvs format to fn
    public static boolean write(CustomerList cl, File fn){
        try {
            PrintStream output = new PrintStream(fn); 
            
            for (int i = 0; i < cl.size; ++i) {
                output.println(cl.get(i).toCSV());
            }
            return true;
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return false;
    }
    
    @Override
    public String toString() {
        String retString = "";
        double totalSales = 0.0;
        for (int i = 0; i < this.size; ++i) {
            //System.out.println(c.toString());
            retString += (this.get(i).toString() + "\n");
            //system.out.println(i + " -- " + c.getGrossSales());
            totalSales += Double.parseDouble(this.get(i).getGrossSales());
        }
        retString += String.valueOf(totalSales);
        return retString;
    }
    
}
