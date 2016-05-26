/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 *<h1> Kelas A </h1>
 * Kelas A merupakan kelas yang mengimplementasi interface 
 * AddAndSubInterface. Pada kelas A terdapat 3 method yang 
 * mengandung anotasi override yaitu method add, sub, dan to String
 * 
 * @author ayu aldila salma
 */
public class A implements AddAndSubInterface {
    
    /**
     * Ini merupakan konstruktor dari kelas A yang akan
     * menampilkan tulisan Ctor di kelas A     *
     */
    public A() {        
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    /**
     * Ini merupakan method implementasi dari method add yang
     * terdapat dari interface AddAndSubInterface
     * method ini berfungsi untuk menjumlahkan dua bilangan
     * 
     * @param n1 merupakan param pertama dalam method add
     * @param n2 merupakan param kedua dalam method add
     * @return mengembalikan nilai dari hasil penjumalah n1 dan n2
     */
    @Override
    public int add(int n1, int n2) {
       return n1 + n2;
    }
    
    /**
     * Ini merupakan method implementasi dari method sub yang
     * terdapat dari interface AddAndSubInterface
     * method ini berfungsi untuk mengurangi dua bilangin
     * @param n1 meruapakn param pertama method sub sebagai
     *           bilangan pengurang
     * @param n2 merupakan param kedua method sub sebagai
     *           bilangan yang dikurangkan dengan n1
     * @return  mengembalikan nilai dari hasil pengurangan n1 dengan n2
     */
    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
    
    /**
     * Ini merupakan method yang mengoverride method toString
     * method ini akan menampilkan tulisan toString di kelas A
     * 
     * @return menampilkan tulisan  toString di kelas A
     */
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
    
}
