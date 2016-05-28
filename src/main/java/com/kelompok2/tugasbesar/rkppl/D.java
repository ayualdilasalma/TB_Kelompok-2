/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 * Kelas D adalah kelas yang mengimplementasikan
 * Interface PowInterface, didalamnya terdapat 4 method
 * 1 method berasal dari interface PowInterface, 2 method berasal dari
 * Interface MulAndDivInterface karena PowInterface adalah turunan dari 
 * MulAndDivInterface, dan 1 method lagi adalah method toString.
 * 
 * @author Muhamad Rifki Nugraha
 */
public class D implements PowInterface {
    
/**  
 * Konstruktor yang menampilkan output
 * Ctor di kelas D
 */   
    public D() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }
    
/**  
 * Method pow adalah method yang berasal dari
 * Interface powInterface dengan 2 parameter yaitu n1 dan n2
 * yang dapat digunakan untuk melakukan
 * pembagian bilangan n1/n2
 */
    @Override
    public double pow(double n1, double n2) {
       double hasil = 1;
       for (int i = 1; i <= n2; i++){
           hasil = hasil * n1;
       }
       return hasil;
    }
    
/**  
 * Method mul adalah method yang berasal dari Interface induk
 * dari PowInterface yaitu Interface MulAndDivInterface
 * yang memiliki 2 parameter dan berfungsi untuk melakukan 
 * perkalian bilangan
 */
    @Override
    public double mul(double n1, double n2) {
        return n1 * n2;
    }

/**  
 * Method div juga merupakan method yang berasal dari Interface induk
 * dari PowInterface yaitu Interface MulAndDivInterface
 * yang memiliki 2 parameter dan berfungsi untuk melakukan 
 * pembagian bilangan n1/n2
 */
    @Override
    public double div(double n1, double n2) {
        return n1 / n2;
    }

 /**  
 * Method toString adalah method yang akan menampilkan
 * output toString di kelas D
 */
    @Override
    public String toString() {
        return "toString di kelas " +getClass().getSimpleName();
    }

}
