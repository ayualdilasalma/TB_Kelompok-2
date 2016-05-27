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
    /**
     * Konstruktor untuk menampilkan Ctor di kelas B
     */
    public B() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }
    
    /**
     * Method ini merupakan method implementasi dari kelas MulAndDivInterface
     * method ini akan melakukan proses perkalian antara n1 dan n2
     */
    @Override
    public double mul(double n1, double n2) {
        return n1 * n2;
    }
    
    /**
     * Method ini merupakan method implementasi dari kelas MulAndDivInterface
     * method ini akan melakukan proses pembagian antara n1 dan n2
     */
    @Override
    public double div(double n1, double n2) {
        return n1 / n2;
    }
    
    /**
     * Method ini akan menampilkan output toString di kelas B
     */
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
    
    
    
}
