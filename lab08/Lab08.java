/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.ArrayList;
import java.io.*; 
import java.util.Scanner; 

/**
 *
 * @author Anand
 */
public class Lab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
           PART 1: 
        */
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        // ["to", "be", "or", "not", "to", "be", "hamlet"]
        //  ["be", "be", "is", "not", "or", "question", "that", "the", "to", "to"]
        // ["How, "are", "you?"]
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");
        
        list2.add("be");
        list2.add("be");
        list2.add("is");
        list2.add("not");
        list2.add("or");
        list2.add("question");
        list2.add("that");
        list2.add("the");
        list2.add("to");
        list2.add("to");
        
        list3.add("How");
        list3.add("are");
        list3.add("you?");
        
        // PRINT STATEMENTS COMMENTED OUT FOR PART 2
        list = swapPairs(list);
        //System.out.println(list);
        list2 = removeDuplicates(list2);
        //System.out.println(list2);
        list3 = stutter(list3, 3);
        //System.out.println(list3);
        
        /* 
           PART 2: 
        */
        
        reverse();
        
        ArrayList<Person> people = new ArrayList<Person>();
        people = addPeople(people); // populates the array list with the people from the file
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        
        // checks if person is in the database and prints out their tree if they are
        for (Person person : people){
            if (person.getName().equals(name)){
                System.out.println(person);
            }
        }
    }
    
    // takes in an array list, swapsPairs and returns that list back
    public static ArrayList<String> swapPairs(ArrayList<String> list){
        for (int i = 0; i < list.size(); i+=2) {
            if (i+1 < list.size()){
                String temp = list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, temp);
            }
        }
        return list;
    }
    
    // takes in sorted array list, then removes duplicates, then returns it
    // this implemention keeps in mind there might be more than one duplicate
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            String word = list.get(i);
            for (int j = i+1; j < list.size(); ++j) {
                if (list.get(j).equals(word)) {
                    list.remove(j);
                }
                else {
                    break;
                }
            }
        }   
        return list; 
    }
    
    // takes in an array list, duplicates each element by k times
    // if k is less then 1 then a empaty array list is returned
    // otherwise it returns the list with the duplicates
    public static ArrayList<String> stutter(ArrayList<String> list, int k) { 
        ArrayList<String> retList = new ArrayList<String>();
        
        if (k > 0) { 
            for (String word : list){
                for (int i = 0; i < k; ++i) {
                    retList.add(word);
                }
            }
        }
        return retList;
    }
    
    // reverses the words and the line order in thefile.txt 
    public static void reverse(){
        try {
            File file = new File("thefile.txt"); 
            Scanner input = new Scanner(file); 
            ArrayList<String> lines = new ArrayList<String>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String words[] = line.split(" ");
                String reversedLine = "";
                
                for (int i = 0; i < words.length; ++i) {
                    reversedLine += words[words.length - i - 1];
                    reversedLine += " ";
                }
                lines.add(0, reversedLine);
            } 
            
            PrintStream output = new PrintStream(file);
            
            for (String cLine : lines)
            {
                output.println(cLine);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    // takes in array list, fills the array list with people from file then returns it
    public static ArrayList<Person> addPeople(ArrayList<Person> people) {
        try {
            File file = new File("people.txt"); 
            Scanner input = new Scanner(file); 
            
            int numOfPeople = input.nextInt(); input.nextLine();
            
            for (int i = 0; i < numOfPeople; ++i) {
                String name = input.nextLine();
                
                String motherName = input.nextLine();
                Person mother = new Person(motherName);
                
                String fatherName = input.nextLine();
                Person father = new Person(fatherName);
                
                ArrayList<Person> children = new ArrayList<Person>();
                int numOfChildren = input.nextInt(); input.nextLine();
                for (int j = 0; j < numOfChildren; ++j) {
                    Person child = new Person(input.nextLine());
                    children.add(child);
                }
                
                Person person = new Person(name, mother, father, children);
                people.add(person);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return people;
    }
}
