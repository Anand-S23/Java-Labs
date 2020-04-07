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
public class WalkupTicket extends Ticket {

    public WalkupTicket(int number) {
        super(number);
        price = 50.0;
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
