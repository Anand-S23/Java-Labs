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
public class Customer extends Person implements Comparable<Customer> {
    private String customerID, grossSales;
    
    // custructor with all the fields 
    public Customer(String custID, String grsSales, String fName, String lName, 
            String addr, String city, String state, String zipcode) {
        super(fName, lName, addr, city, state, zipcode);
        this.customerID = custID; 
        this.grossSales = grsSales;
    }
    
    // default protected coustomer consturcter
    protected Customer() {
        super("", "", "", "", "", "");
        this.customerID = "";
        this.grossSales = "";
    }
    
    // constructor which takes in csv
    public Customer(String csv){
        super("", "", "", "", "", "");
        this.customerID = "";
        this.grossSales = "";
        this.copyCSV(csv);
    }
    
    // Getters
    public String getCustomerID() { return this.customerID; } 
    public String getGrossSales() { return this.grossSales; } 
    
    // Setters
    public void setCustormerID(String custID) { this.customerID = custID; }
    public void setGrossSales(String grsSales) { this.grossSales = grsSales; }
    
    // copys all of the values of customer c
    public void copy(Customer c){
        super.copy(c.getFirstName(), c.getLastName(), c.getAddress(), 
                   c.getCity(), c.getState(), c.getZipcode());
        this.customerID = c.getCustomerID();
        this.grossSales = c.getGrossSales();
    }
    
    // copies new fields that are passed in
    public void copy(String custID, String grsSales, String fName, String lName, 
            String addr, String city, String state, String zipcode) {
        super.copy(fName, lName, addr, city, state, zipcode);
        this.customerID = custID; 
        this.grossSales = grsSales; 
    }
    
    // returns a customer with all the same values 
    @Override
    public Customer clone() {
        Customer c = new Customer(this.customerID, this.grossSales, 
                this.getFirstName(), this.getLastName(), this.getAddress(),
                this.getCity(), this.getState(), this.getZipcode());
        return c;
    }
    
    public void copyCSV(String csv){
        String [] fields = csv.split(",");
        this.copy(fields[0], fields[1], fields[2], fields[3], fields[4], 
                fields[5], fields[6], fields[7]);
    }

    // returns a csv formated string
    public String toCSV(){
        return customerID + "," + grossSales + "," + super.toCSV();
    }
    
    @Override
    public String toString(){
        return "CustomerID:\t" + customerID + "\nGrossSales:\t" + grossSales 
                + "\n" + super.toString();
    }
    
    @Override
    public int compareTo(Customer c) {
        return this.customerID.compareTo(c.getCustomerID());
    }
    
}
