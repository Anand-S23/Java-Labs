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
public class RationalNumber {
    // variables 
    private int numerator; 
    private int denominator;
    
    // construtor for rational number, takes in numerator and a non-zero denominator 
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) 
            throw new IllegalArgumentException("Zero can't be the denominator.");
        this.numerator = numerator;
        this.denominator = denominator; 
    } 
    
    // counstructor for rational number, numerator 0 and denominator 1
    public RationalNumber() {
        this.numerator = 0; 
        this.denominator = 1;
    }
    
    // returns the numerator
    public int getNumerator() {
        return this.numerator;
    }
    
    // returns the denominator 
    public int getDenominator() {
        return this.denominator;
    }
    
    // string representation
    public String toString() {
        return (this.numerator + "/" + this.denominator);
    }
}
