/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import java.util.*;

public class Lab0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        String s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        s = input.nextLine();
        System.out.println("Hello, " + s);
        
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("Your are " + age);
        
        if (age <= 35)
            System.out.println("You are young.");
        else if (age <= 55)
            System.out.println("You are middle age.");
        else
            System.out.println("You are old");
        
        for (int i = 1; i <= 5; ++i)
        {
            System.out.println("i = " + i);
        }
        
        Person p = new Person(s, age);
        // p.name = s;
        // p.age = age;
        
        System.out.println(p.toString());
        p.incrementAge();
        System.out.println(p.toString());
    }
    
}
