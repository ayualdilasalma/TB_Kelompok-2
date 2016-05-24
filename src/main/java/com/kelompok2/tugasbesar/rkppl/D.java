/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 *
 * @author Rifki
 */
public class D implements PowInterface{
    
    public D(){
        System.out.println("Ctor di kelas D");
    }

    @Override
    public double pow(double n1, double n2) {
        n1 = 0.3;
        n2 = 0.8;
        return n1 + n2;
    }
    
    public String toString() {
        return "toString di kelas D";
    }
}
