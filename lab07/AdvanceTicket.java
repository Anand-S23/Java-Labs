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
public class AdvanceTicket extends Ticket {
    
    public AdvanceTicket(int number, int days) {
        super(number); 
        if (days >= 10) { price = 30.0; } 
        else { price = 40.0; }
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }
    
}
