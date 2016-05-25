/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 *
 * @author RIZQON SIDIK MAULANA
 */
public class B implements MulAndDivInterface {

    public B() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    @Override
    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double div(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
    
    
    
}
