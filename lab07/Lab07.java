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
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ticket ticket = new StudentAdvanceTicket(1, 11);
        System.out.println(ticket.number);
        System.out.println(ticket.price);
        System.out.println(ticket);
        
        Shape cube = new Cube(3);
        System.out.println(cube.surfaceArea());
        System.out.println(cube.volume());
        System.out.println(cube);
    }
    
}
