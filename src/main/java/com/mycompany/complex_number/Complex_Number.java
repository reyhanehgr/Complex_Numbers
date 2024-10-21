/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complex_number;

/**
 *
 * @author PC
 */
public class Complex_Number {

    public static void main(String[] args) {
        Complex z1= new Complex(3,-4);
        Complex z2 = new Complex(8,5);
        Complex z3= z1.add(z2);
        Complex z4 = z2.subtract(z3);
        Complex z5 = z1.multiply(z2);
        Complex z6 = z3.devide(z4);
        
        System.out.format("I = %s\n", Complex.I);
        //System.out.format("Zero = %s\n", Complex.Zero);
        System.out.format("z1 = %s\n", z1);
        System.out.format("abs(z1) = %s\n", z1.abs());
        System.out.format("phase(z1) = %s\n", z1.phase()*180/Math.PI);
        System.out.format("z2 = %s\n", z2);
        System.out.format("z3 = z1 + z2 = %s\n", z3);
        System.out.format("z4 = z2 - z3 = %s\n", z4);
        System.out.format("z5 = z1 * z2 = %s\n", z5);
        System.out.format("z6 = z3 / z4 = %s\n", z6);
    }
}
