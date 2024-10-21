/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complex_number;

/**
 *
 * @author PC
 */
public class Complex {
    
    public static final Complex I = new Complex(0,1);
    public static final Complex Zero = new Complex(0,0);
    
    private double Real;
    private double Imag;
    public Complex (double x){
        Real = x;
        Imag = 0;
    }
    public Complex(){
        Real = 0;
        Imag = 0;
    }
    public Complex (double x , double y){
        Real = x;
        Imag = y;
    }
    public double get_Real(){
        return Real;
    }
    public void set_Real(double x){
        Real = x;
    }
    public double get_Imag(){
        return Imag;
    }
    public void set_Imag(double y){
        Imag = y;
    }
    //@override
    @Override
    public String toString()
    {
        String str;
        double x =Real;
        double y = Imag;
        if(x!= 0){
            str = String.format("%f", x);
            if(y > 0){
                str = str + String.format("+ %fi", y);
            }else if(y < 0){
                str = str + String.format("%fi", y);
            }
        }else{
            if(y != 0){
                str = String.format("%fi", y);
            }else{
                str = String.format("%f", 0);
            }
            
        }
        return str;
    }
    
    public Complex add(Complex z){
        return new Complex(Real + z.get_Real(), Imag + z.get_Imag());
    }
    public Complex add(double x){
        return new Complex (Real + x , Imag);
    }
    public Complex subtract(Complex z){
        return new Complex(Real - z.get_Real(), Imag + z.get_Imag());
    }
    public Complex subtract(double x){
        return new Complex (Real - x , Imag);
    }
    public Complex multiply(Complex z){
        double x1 = Real;
        double y1 = Imag;
        double x2 = z.get_Real();
        double y2 = z.get_Imag();
        return new Complex(x1*x2 - y1*y2 , x1*y2 + x2*y1);
        
    }
    public Complex multiply(double x){
        return new Complex(Real*x , Imag*x);
    }
    public Complex devide(Complex z){
        double x1 = Real;
        double y1 = Imag;
        double x2 = z.get_Real();
        double y2 = z.get_Imag();
        double D = x2*x2 + y2*y2;
        return new Complex((x1*x2 + y1*y2)/D , (y1*x2 - y2*x1)/D);
    }
    public Complex devide(double x){
        return new Complex(Real/x , Imag/x);
    }
    public double abs(){
        return Math.sqrt(Real*Real + Imag*Imag);
    }
    public double phase(){
        return Math.atan2(Imag, Real);
    }
}
