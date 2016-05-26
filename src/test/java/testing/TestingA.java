/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.kelompok2.tugasbesar.rkppl.A;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * Kelas TestingA merupakan kelas yang berisi pengujian
 * untuk kelas implementasi A
 *
 * @author ayu aldila salma
 */
public class TestingA {
    
    // instansiasi variabel a dengan tipe data A
    private A a;
    
    /**
     * method startTest dieksekusi sebelum test dimulai
     * dalam method ini dilakukan instansiasi objek yang akan dites
    */
    @Before
    public void startTest() {
        // instansiasi objek a dengan tipe objek A
        a = new A();
        System.out.println("Mengawali Testing Untuk Kelas A");
    }
    
    /*
    * method testCase1 berisi untuk menguji kebenaran nilai
    * yang dihasilkan dari method add dalam kelas A
    */
    @Test
    public void testCase1() {
        int jum = a.add(8, 1);
        assertTrue("Seharusnya benar", jum == 9 );
    }    
    
    /*
    * method testCase2 berisi untuk menguji kebenaran nilai
    * yang dihasilkan dari method sub dalam kelas A
    */
    @Test
    public void testCase2() {
        int min = a.sub(5, 2);
        assertTrue("Seharusnya benar", min == 3);
    }
    
    /*
    * method testCase3 berisi untuk menguji method add dalam
    * kelas A ketika diberikan parameter dengan nilai yang sama
    * tetapi terletak dalam posisi yang berbeda seharusnya 
    * tetap mengembalikan nilai yang sama
    */
    @Test
    public void testCase3() {
        assertEquals("Seharusnya bernilai sama", a.add(3, 7), a.add(7, 3));
    }
    
    /*
    * method testCase4 berisi untuk menguji method sub dalam
    * kelas A ketika diberikan parameter dengan nilai yang sama
    * tetapi terletak dalam posisi yang berbeda seharusnya 
    * tidak mengembalikan nilai yang sama
    */
    @Test
    public void testCase4() {
        assertNotEquals("Seharusnya tidak sama", a.sub(3, 4), a.sub(4, 3));
    }
    
    /**
     * method endTest akan dieksekusi setelah pengujian selesai dilakukan
     * sebagai penanda bahwa testing telah selesai dilakukan
     */
    @After
    public void endTest() {
        System.out.println("Mengakhiri Testing Untuk Kelas A ");
    }
    
}
