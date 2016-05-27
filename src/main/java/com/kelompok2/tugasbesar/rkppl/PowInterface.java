/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 * Interface PowInterface adalah Interface
 * yang memiliki Interface induk yaitu MulAndDivInterface,
 * pada interface PowInterface memiliki 1 method
 * untuk kelas yang akan mengimplementasikannya, sedangkan
 * pada Interface MulAndDivInterface ada 2 kelas
 * yang harus di implementasikan
 * 
 * 
 * @author Muhamad Rifki Nugraha
 */
public interface PowInterface extends MulAndDivInterface {
    
    double pow(double n1, double n2);
    
}
