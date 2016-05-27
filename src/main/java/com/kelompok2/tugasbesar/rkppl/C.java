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

/**  Konstruktor yang menampilkan Ctor di kelas C*/
    public C() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    /**
     * Method untuk menambah variable n1 dan n2 dimana method penjumlahannya di
     * panggil di kelas A dan variable n1 dan n2 dikonversi kan terlebih dahulu
     * ke integer sesuai dengan method penjumlahan yang ada di kelas A
     */
    public int add() {
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.add(n1, n2);
    }

    /**
     * Method untuk pengurangan variable n1 dan n2 dimana method pengurangan
     * dipanggil di kelas A dan variable n1 dan n2 dikonversi kan terlebih
     * dahulu ke integer sesuai dengan method pengurangan yang ada di kelas A
     */
    public int sub() {
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.sub(n1, n2);
    }

    /**
     * Method perkalian variable n1 dan n2 dimana method perkalian dipanggil
     * dari kelas B
     *
     */

    public double mul() {
        B b = new B();
        return b.div(n1, n2);
    }

    /**
     * Method pembagian variable n1 dan n2 dimana method pembagian dipanggil
     * dari kelas B
     */
    public double div() {
        B b = new B();
        return b.mul(n1, n2);
    }

    /**
     * Method untuk mengambil nilai dari variable N1
     */
    public double getN1() {
        return n1;
    }

    /**
     * Method untuk mengisi nilai di variable N1
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * Method untuk mengambil nilai dari variable N2
     */
    public double getN2() {
        return n2;
    }
    /**
     * Method untuk mengisi nilai di variable N2
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }
    /**
     * Method untuk menampilkan output toString ada di kelas C
     */
    @Override
    public String toString() {
        return "toString ada di kelas " + getClass().getSimpleName();
    }

}
