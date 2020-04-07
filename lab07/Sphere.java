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
public class Sphere implements Shape {
    private double radius; 
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double surfaceArea() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    @Override 
    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString() {
        return "Sphere {radius: " + radius + "}";
    }
}
