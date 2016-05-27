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

    public E() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }
    
    
}
