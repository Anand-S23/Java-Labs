/*
Anand Singh 

Task: Program which prints patterns using loops

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author tul01835
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        squares();
        printFib();
        printPyrimid();
        pattern();
    }
    
    public static void squares() {
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d ", i*i);
        }
        System.out.println("\n");
    }
    
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }
    
    public static void printFib() {
        for (int i = 1; i <= 12; ++i) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println("\n");
    }
    
    public static void printPyrimid() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= 5-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%d", i);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void pattern() {
        System.out.print("+");
        for (int i = 0; i < 6; ++i) {
            System.out.print("-");
        }
        System.out.print("+\n");

        for (int i = 1; i <= 3; ++i) {
            System.out.print("|");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < (2*i-2) ; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        
        for (int i = 1; i <= 3; ++i) {
            System.out.print("|");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < (2*i-2) ; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("^");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        
        System.out.print("+");
        for (int i = 0; i < 6; ++i) {
            System.out.print("-");
        }
        System.out.print("+\n");
    
        for (int i = 3; i >= 1; --i) {
            System.out.print("|");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 0; j < (2*i-2) ; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        
        for (int i = 3; i >= 1; --i) {
            System.out.print("|");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 0; j < (2*i-2) ; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("V");
            for (int j = 0; j < 3-i; ++j)
            {
                System.out.print(" ");
            }
            System.out.print("|\n");
        }
        
        System.out.print("+");
        for (int i = 0; i < 6; ++i) {
            System.out.print("-");
        }
        System.out.print("+\n");
    }
}
