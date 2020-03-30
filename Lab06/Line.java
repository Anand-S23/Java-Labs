package lab06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anand
 */
public class Line {
    // variables
    private Point p1;
    private Point p2;
    
    // constructor for line, takes in two points
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // constructor for line, takes in x and y for two points
    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point (x2, y2);
    }
    
    // returns one of the points
    public Point getP1() {
        return this.p1;
    }
    
    // returns the other point
    public Point getP2() {
        return this.p2;
    }
   
    // string representation
    public String toString() {
        return ("[(" + this.p1.getX() + "," + this.p1.getY() + "),(" + this.p2.getX() + "," + this.p2.getY() + ")]");
    }
    
    // returns the slope of the line
    public double getSlope() {
        if (this.p1.getX() == this.p2.getX()) {
            throw new IllegalArgumentException("Zero can't be the denominator, so the two points can't be equal.");
        }
        
        return((double)(this.p2.getY() - this.p1.getY()) / (double)(this.p2.getX() - this.p1.getX()));  
    }
    
    // returns boolean of if a point is collinear to the line
    public boolean isCollinear(Point p) {
        return (this.getSlope() == ((double)(p.getY() - this.p1.getY()) / (double)(p.getX() - this.p1.getX())));        
    }  
}
