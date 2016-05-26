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
public class C extends Math {
    private double n1;
    private double n2;

    public C() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }
    
    public int add(){
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.add(n1, n2);
    }
    
    public int sub(){
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.sub(n1, n2);
    }
    
    public double mul(){
        B b = new B();
        return b.div(n1, n2);
    }
    
    public double div(){
        B b = new B();
        return b.mul(n1, n2);
    }

    @Override
    public String toString() {
        return "toString ada di kelas " + getClass().getSimpleName();
    }
    
}
