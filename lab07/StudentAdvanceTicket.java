/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Anand
 */
public class StudentAdvanceTicket extends AdvanceTicket {
    
    public StudentAdvanceTicket(int number, int days) {
        super(number, days);
        if (days >= 10) { price = 15.0; } 
        else { price = 20.0; }
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }
    
    @Override 
    public String toString() {
        return "Number: " + number + ", Price: " + price + " (ID required)";
    }
    
}
