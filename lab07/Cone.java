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
public class Cone implements Shape {
    private double height; 
    private double radius;
    
    public Cone(double height, double radius) {
        this.height = height; 
        this.radius = radius;
    }
    
    @Override 
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }
    
    @Override 
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
    
    @Override
    public String toString() {
        return "Cone {height: " + height + ", radius: " + radius + "}";
    }
    
    public double getHeight() {
        return height; 
    }
    
    public double getRadius() {
        return radius;
    }
}
