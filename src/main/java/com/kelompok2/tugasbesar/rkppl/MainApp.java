/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

/**
 *
 * @author Ginan
 */
public class MainApp {

    public static void main(String[] args) {
        int n = 7;
        int n1 = 8;
        int n2 = 9;

        D d = new D();
        System.out.println(d.pow(n1, n2));
        System.out.println(d.mul(n1, n2));
        System.out.println(d.div(n1, n2));
        System.out.println(d.toString());
        
        C c = new C();
    }
}
