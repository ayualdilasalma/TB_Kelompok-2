/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.tugasbesar.rkppl;

import java.util.List;

/**
 *
 * @author Ginan
 */
public class E {

    private List dataList;

    /**
     * Konstruktor yang menampilkan output Ctor di kelas D
     */
    public E() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    /**
     * Mengecek apakah dari data yang ada mengandung kata sesuai parameter
     */
    public boolean contains(String n) {
        return this.dataList.toString().contains(n);
    }

    /**
     * Method get berfungsi sebagai pemberi nilai dari attribut Kelas ini dari
     * kelas lain yang meminta
     */
    public List getDataList() {
        return dataList;
    }

    /**
     * Method set berfungsi sebagai method yang menerima nilai dari kelas lain
     * yang nantinya akan dimasukkan kedalam attribut yang ada di Kelas ini
     */
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    /**
     * Method toString adalah method yang akan menampilkan output toString di
     * kelas E
     */
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
}
