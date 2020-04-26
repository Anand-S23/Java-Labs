/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

/**
 *
 * @author Anand
 */
public class Person {
    private String firstName, lastName, address, city, state, zipcode; 
    
    public Person(String fName, String lName, String addr, 
            String city, String state, String zipcode) {
        this.firstName = fName;
        this.lastName = lName; 
        this.address = addr; 
        this.city = city; 
        this.state = state; 
        this.zipcode = zipcode; 
    }
    
    // default protected person constructors
    protected Person(){
        this.firstName = "";
        this.lastName = ""; 
        this.address = ""; 
        this.city = ""; 
        this.state = ""; 
        this.zipcode = ""; 
    }
    
    // Getter funtions to get the values of person
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; } 
    public String getAddress() { return address; } 
    public String getCity() { return city; } 
    public String getState() { return state; } 
    public String getZipcode() { return zipcode; }
    
    // Setter functions to set the values for person
    public void setFirstName(String fName) { this.firstName = fName; }
    public void setLastName(String lName) { this.lastName = lName; }
    public void setAddress(String addr) { this.address = addr; } 
    public void setCity(String city) { this.city = city; } 
    public void setState(String state) { this.state = state; }
    public void setZipcode(String zipcode) { this.zipcode = zipcode; } 
    
    // copies all fields from person p
    public void copy(Person p){
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName(); 
        this.address = p.getAddress();
        this.city = p.getCity();
        this.state = p.getState(); 
        this.zipcode = p.getZipcode();
    }
    
    // copies new fields that are passed in
    public void copy(String fName, String lName, String addr, 
            String city, String state, String zipcode) {
        this.firstName = fName;
        this.lastName = lName; 
        this.address = addr; 
        this.city = city; 
        this.state = state; 
        this.zipcode = zipcode; 
    }
    
    // returns a person with all the same values 
    public Person clone() {
        return new Person(firstName, lastName, address, city, state, zipcode);
    }
    
    // returns string in this format 
    // -> Waylon,Johnson,440 Richmond Park East,Hamden,CT,06517-2703
    public String toCSV(){
        return firstName + "," + lastName + "," + address + "," + city + "," 
                + state + "," + zipcode;
    }
    
    @Override
    public String toString() {
        return "FirstName:\t" + firstName + "\nLast Name:\t" + lastName +
                "\nAddress:\t" + address + "\nCity:\t\t" + city + "\nState:\t\t" + 
                state + "\nZipCode:\t" + zipcode;
    }
}