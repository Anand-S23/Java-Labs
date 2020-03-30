/*
Anand Singh 

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5b;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Anand
 */
public class Lab5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializing arr which will be passed into stdev
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        stdev(arr);
        
        // initializing arrays which will be passed into matrixAddition 
        int[][] arrA = {{1, 2}, {3, 4}}; 
        int[][] arrB = {{1, 2}, {3, 4}}; 
        // reciving the array which is returned fro matrixAddtion
        int[][] arrC = matrixAddition(arrA, arrB);
        
        // prints out the 2-D array
        System.out.print("\n[");
        for (int i = 0; i < arrA.length; ++i) {
            System.out.print("[");
            for (int j = 0; j < arrA[i].length; ++j) {
                System.out.print(arrC[i][j]);
                if (j < arrA[i].length - 1)
                    System.out.print(",");
            }
            System.out.print("]");
            if (i < arrA.length - 1)
                    System.out.print(",");
        }
        System.out.println("]\n");
        
        personalityTest();
    }
    
    // calcuates the average of an array and returns it
    public static double avg(int num[]) {
        double sum = 0;
        for (int i = 0; i < num.length; ++i) {
            sum += num[i];
        }
        
        return (sum / num.length);
    }
    
    // calculates the stdev and prints it out 
    public static void stdev(int num[]) {
        double sum = 0;
        for (int i = 0; i < num.length; ++i) {
            sum += Math.pow((num[i] - avg(num)), 2.0);
        }
        
        double stdev = Math.sqrt((sum / (num.length - 1)));
        
        System.out.printf("%.3f\n", stdev);
    }
    
    // adds 2 2-D arrays then returns that array
    public static int[][] matrixAddition(int arrA[][], int arrB[][]) {
        int arrC[][] = new int[arrA.length][arrA[0].length];
        // loop through arrays adding each element together then storing in arrC
        for (int i = 0; i < arrA.length; ++i) {
            for (int j = 0; j < arrA[i].length; ++j) {
                int num = (arrA[i][j] + arrB[i][j]);
                arrC[i][j] = num; 
            }
        }
        
        return arrC;
    }
    
    // reads the answers from the file and prints out the calculations
    public static void personalityTest() {
        File file = new File("answers.txt");

        try {
            Scanner input = new Scanner(file);
            
            // reads and parses files
            while (input.hasNextLine()) {
                int count[] = new int[4]; 
                String personality = "";
                String name = input.nextLine();
                String answers = input.nextLine();
                
                // finds how many Bs there are in the text
                for (int i = 0; i < answers.length(); ++i) {
                    if (i % 7 == 0 && answers.charAt(i) == 'B') {
                        count[0]++; 
                    }
                    if ((i % 7 == 1 || i % 7 == 2) && answers.charAt(i) == 'B') {
                        count[1]++; 
                    }
                    if ((i % 7 == 3 || i % 7 == 4) && answers.charAt(i) == 'B') {
                        count[2]++; 
                    }
                    if ((i % 7 == 5 || i % 7 == 6) && answers.charAt(i) == 'B') {
                        count[3]++; 
                    }
                    
                }
                
                // calculates percentages 
                double bOne = (count[0] / 10.0) * 100.0;
                double bTwo = (count[1] / 20.0) * 100.0;
                double bThree = (count[2] / 20.0) * 100.0;
                double bFour = (count[3] / 20.0) * 100.0;
                
                // which letters to use
                if (bOne > 50)
                    personality += 'E';
                else
                    personality += 'I';
                if (bTwo > 50)
                    personality += 'N';
                else
                    personality += 'S';
                if (bThree > 50)
                    personality += 'F';
                else
                    personality += 'T';
                if (bFour > 50)
                    personality += 'P';
                else
                    personality += 'J';

                // prints out the answer
                System.out.println(name + ":");
                System.out.printf("%dA–%dB %dA–%dB %dA–%dB %dA–%dB\n", (10 - count[0]), count[0], (20 - count[1]), count[1], (20 - count[2]), count[2], (20 - count[3]), count[3]);
                System.out.printf("[%d%%, %d%%, %d%%, %d%%] = %s\n", (int)bOne, (int)bTwo, (int)bThree, (int)bFour, personality);
                System.out.println("");
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
