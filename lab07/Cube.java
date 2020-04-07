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
public class Cube implements Shape{
    private double side; 
    
    public Cube(double side) {
        this.side = side; 
    }
    
    @Override
    public double surfaceArea() {
        return 6*Math.pow(side, 2);
    }
    
    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
    
    @Override
    public String toString() {
        return "Cube {side length: " + side + "}";
    }
    
    public double getSideLength() {
        return side;
    }
}
