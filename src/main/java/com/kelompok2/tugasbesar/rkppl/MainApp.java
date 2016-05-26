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
        //Membuat variable n,n1,n2 dan memberikan nilai pada masing2 variable
        int n = 7;
        int n1 = 8;
        int n2 = 9;

        //Instansiasi Kelas D
        D d = new D();
        //Pemanggilan method pow pada Kelas D
        System.out.println(d.pow(n1, n2));
        //Pemanggilan method mul pada Kelas D
        System.out.println(d.mul(n1, n2));
        //Pemanggilan method div pada Kelas D
        System.out.println(d.div(n1, n2));
        //Pemanggilan method toString pada Kelas D
        System.out.println(d.toString());
        System.out.println("");

        //Instansiasi Kelas C
        C c = new C();
    }
}
