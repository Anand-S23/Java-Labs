/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Anand
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Line l = new Line(p1, p2);
        
        double slope = l.getSlope();
        System.out.println(slope);
        
        Point p = new Point(3, 3);
        boolean col = l.isCollinear(p);
        System.out.println(col);
        
        RationalNumber n = new RationalNumber(2,5);
        System.out.println(n.toString());
       
    }
    
}
