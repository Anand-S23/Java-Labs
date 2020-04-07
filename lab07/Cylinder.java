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
public class Cylinder implements Shape {
    private double height; 
    private double radius;
    
    public Cylinder(double height, double radius) {
        this.height = height; 
        this.radius = radius;
    }
    
    @Override 
    public double surfaceArea() {
        return 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
    }
    
    @Override 
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    @Override
    public String toString() {
        return "Cylinder {height: " + height + ", radius: " + radius + "}";
    }
}
