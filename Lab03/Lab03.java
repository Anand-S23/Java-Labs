/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author Anand
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Getting input to compute quadratic
        System.out.print("Enter the integer A: ");
        int a = input.nextInt();
        
        System.out.print("Enter the integer B: ");
        int b = input.nextInt();
        
        System.out.print("Enter the integer C: ");
        int c = input.nextInt();
        
        computeQuad(a, b, c);
                
        // Gets input to compute area
        System.out.print("Enter A: ");
        double d = input.nextDouble();
        
        System.out.print("Enter B: ");
        double e = input.nextDouble();
        
        System.out.print("Enter C: ");
        double f = input.nextDouble();
        
        System.out.println("The area of the triangle is " + computeArea(d, e, f));
        
        // Prints string in reverse
        printReverse("hello there!");
        
        // Computes the interest
        computeInterest();
    }
    
    // Takes in three int a b c and prints out the quad (returns nothing)
    public static void computeQuad(int a, int b, int c) {
        int determinat = (b*b - 4*a*c);
        
        int plus = (b) - ((int) Math.sqrt(determinat));
        plus = (plus/(2*a));
        
        int minus = (-b) + ((int) Math.sqrt(determinat));
        minus = (minus/(2*a));
        
        System.out.println("The two roots are x = " + plus + " and x = " + minus);
    }
    
    // takes in three double length a b c and returns a double area
    public static double computeArea(double a, double b, double c) {
        double s = ((a + b + c) / 2);
        double area = Math.sqrt((s * (s-a) * (s-b) * (s-c)));
        return area;
    }
    
    // takes in a string and prints out the string reversed (returns nothing)
    public static void printReverse(String input) {
        for (int i = (input.length() - 1); i >= 0; --i) {
            System.out.print(input.charAt(i));
        }
        System.out.println("");
    }
    
    // computes the interest and balance over the 25 years and prints it out (returns nothing)
    public static void computeInterest() {
        double totalMoney = 1000;
        for (int i = 1; i <= 25; ++i) {
            System.out.println("--------------");
            System.out.println("Year " + i);
            System.out.printf("Current Balance: $%.2f\n", totalMoney);
            
            double interest = totalMoney * .065;
            System.out.printf("Interest: $%.2f\n", interest);
            if (i != 1)
                interest += 100;
            System.out.printf("New Deposit: $%.2f\n", interest);
            totalMoney += interest;
            
            System.out.printf("New Balance: $%.2f\n", totalMoney);
        }
        System.out.println("--------------");
    }
}
