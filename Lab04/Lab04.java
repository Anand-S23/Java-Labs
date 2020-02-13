/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author tul01835
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("The sum is " + fractionSum());
        
        //Scanner input = new Scanner(System.in);
        //System.out.print("How many numbers would you like to enter? ");
        //int n = input.nextInt();
        //smallestLargest(n);
        
        //showTwos(10);
        //showTwos(3);
        //showTwos(1);
        //showTwos(2);
        
        //pascalTriangle();
        //toBinary(44);
    }
    
    public static double fractionSum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        while (n < 0) {
            System.out.print("Enter n: ");
            n = input.nextInt();
        }
        
        double sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += (1.0/i);
        }
        
        return sum;
    }
    
    public static void smallestLargest(int n) {
        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        
        for (int i = 0; i < n; ++i) {   
            System.out.printf("Number %d: ", i+1);
            int number = input.nextInt();
            if (i == 0) {
                smallest = number;
                largest = number;
            }
            
            if (largest < number)
                largest = number;
            if (number < smallest)
                smallest = number;
        }
        
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
    
    public static void pascalTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many lines of the pascal triangle would you like to print? ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; ++i) {
            for (int k = (n-i); k >= 0; --k)
            {
                System.out.print("    ");
            }
            for (int j = 0; j < (i+1); ++j) {
                int place = fact(i) / (fact(j)*fact(i - j));
                System.out.print(place);
                System.out.print("        ");
            }
            System.out.println("");
        }
    }
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
    
    public static void showTwos(int n) {
        System.out.print(n + " = ");
        
        while (n % 2 == 0) {    
            System.out.print("2 * ");
            n = (n/2);
        }
        
        System.out.println(n);
    }
    
    public static void toBinary(int n) {
        String bin = "";
        
        while(n != 0) {
            if (n % 2 == 0) {
                bin = 0 + bin;
            }
            else {
                bin = 1 + bin;
            }
            n /= 2;
        }
        
        System.out.println(bin);
    }
    
    public static void pigLatin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = input.next();
        
        while (!(n.equals("-1"))) {
            
            n = input.next();
        }
    }
}
