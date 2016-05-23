/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 *
 * @author dilacim
 */
public class A implements AddAndSubInterface {

    public A() {        
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    @Override
    public int add(int n1, int n2) {
       return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public String toString() {
        return "toString di kelas A";
    }
    
}
