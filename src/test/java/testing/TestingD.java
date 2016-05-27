/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.kelompok2.tugasbesar.rkppl.A;
import com.kelompok2.tugasbesar.rkppl.D;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Kelas TestingA merupakan kelas yang berisi pengujian
 * untuk kelas implementasi D
 * 
 * @author Muhamad Rifki Nugraha
 */
public class TestingD {
    private D d;
    
 /**
 * Method awalTest adalah method sebelum pengujian
 * yang akan menampilkan output Mengawali Testing
 */   
    @Before
    public void awalTest() {
        d = new D();
        System.out.println("Mengawali Testing");
    }
    
/**
 * Method testCase1 adalah method yang melakukan pengujian apakah
 * hasil yang dihasilkan dari method pow tidak sama
 * dengan hasil yang diinginkan, misalnya 2.6
 */     
    @Test
    public void testCase1() {
        assertNotSame("Seharusnya error", d.pow(2.0, 0.6), 2.6);
    }

/**
 * Method testCase2 adalah method yang melakukan pengujian apakah
 * hasil yang dihasilkan dari method pow sama
 * dengan hasil yang diinginkan, misalnya 6.7
 */
    @Test
    public void testCase2() {
        assertEquals("Harusnya tidak error", d.pow(2.2, 4.5), 6.7);
    }

/**
 * Method setelahTest adalah method yang akan
 * mengeluarkan output Mengakhiri Testing setelah
 * pengujian selesai
 */
    @After
    public void setelahTest() {
        System.out.println("Mengakhiri Testing");
    }
    
}
