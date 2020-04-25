/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.ArrayList;

/**
 *
 * @author Anand
 */
public class Person {
    private String name; 
    private Person mother, father; 
    private ArrayList<Person> children;
    
    // constructor 
    public Person(String name, Person mother, Person father, ArrayList<Person> children) {
        this.name = name; 
        this.mother = mother; 
        this.father = father; 
        this.children = children;
    }
    
    // constuctor if Person has no children
    public Person(String name, Person mother, Person father) {
        this.name = name; 
        this.mother = mother; 
        this.father = father; 
        children = new ArrayList<Person>();
    }
    
    // constuctor with only the name 
    public Person(String name) {
        this.name = name;
    }
    
    // Getter functions which return the name, mother, father, array list of children
    public String getName() { return name; }
    public Person getMother() { return mother; } 
    public Person getFather() { return father; } 
    public ArrayList<Person> getChildren() { return children; } 
    
    // Setter functions to set the values of name, mother, father, children
    public void setName(String name) { this.name = name; } 
    public void setMother(Person mother) { this.mother = mother; }
    public void setFather(Person father) { this.father = father; }
    public void setChildren(ArrayList<Person> children) { this.children = children; }
    
    @Override
    public String toString() {
        String line = " Line:\n\t" + name + "\n\t\t";
        String c = "Children:\n";
        for (Person child : children) {
            c = c + "\t" + child.getName() + "\n";
        }
        
        return "Maternal" + line + mother.getName() + "\n"
                + "Paternal" + line + father.getName() + "\n" + c;
    }
}
