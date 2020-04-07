package lab07;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anand
 */
public abstract class Ticket {
    protected int number; 
    protected double price;
    
    public Ticket(int number) {
        this.number = number;
    }
    
    abstract public double getPrice();
    abstract public int getNumber();
    
    @Override
    public String toString() {
        return "Number: " + number + ", Number: " + price;
    }
}
