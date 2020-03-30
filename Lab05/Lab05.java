/*

Anand Singh

Task: Reading and writing to files

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Anand
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        evenNumbers();
        
        inputStats();
        
        story();
    }
    
    // reads num from file, prints out the sum, and percent even numbers
    public static void evenNumbers() {
        File file = new File("numbers.txt");
        int count = 0;
        int evenCount = 0;
        int sum = 0;
        
        try {
            Scanner input = new Scanner(file);
            
            while (input.hasNextInt()) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                }
                count++;
                sum += num;
            }
            
            double percent = ((double) evenCount / (double) count) * 100;
            
            System.out.printf("%d numbers, sum = %d\n", count, sum);
            System.out.printf("%d even (%.2f)\n", evenCount, percent);
            System.out.println("");
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    // reads file, interperts data, prints the calcutation preformed (num of words etc)
    public static void inputStats() {
        File file = new File("input.txt");
        int currentLine = 0;
        String longestLine = "";
        int longest = 0;
        try {
            Scanner input = new Scanner(file);
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                currentLine++;
                
                String words[] = line.split(" ");
                int token = words.length;
                if (token > longest) {
                    longest = token; 
                    longestLine = line;
                }
                
                int longestWord = 0;
                for (int i = 0; i < token; ++i){
                    if (words[i].length() > longestWord)
                        longestWord = words[i].length();
                }
                System.out.printf("Line %d has %d tokens (longest = %d)\n", currentLine, token, longestWord);
            }
            System.out.println("Longest Line: " + longestLine);
            System.out.println("");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    // Takes in input from charater, then prints out to file
    public static void story() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String storyFile = input.next();

        System.out.print("Enter an adjective: ");
        String adj = input.next(); 

        System.out.print("Enter a plural noun: ");
        String pnoun = input.next();

        System.out.print("Enter a noun: ");
        String noun = input.next();

        System.out.print("Enter another adjective: ");
        String adj2 = input.next();

        System.out.print("Enter a place: ");
        String place = input.next();

        try {
            PrintStream output = new PrintStream(new File(storyFile));
            
            output.printf("One of the most %s characters in fiction is named\n \"Tarzan of the %s.\" Tarzan was raised by a/an\n %s and lives in the %s jungle in the\n heart of darkest %s.",
                    adj, pnoun, noun, adj2, place);
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

