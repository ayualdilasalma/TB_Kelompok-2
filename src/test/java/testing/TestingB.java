/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import com.kelompok2.tugasbesar.rkppl.B;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Badrus Salam
 */
public class TestingB {
    // instansiasi variabel b dengan tipe data B
    private B b;
    /*
     * method startTest dieksekusi sebelum test dimulai
     * dalam method ini dilakukan instansiasi objek yang akan dites
    */
    @Before
     public void startTest() {
        // inisialisasi objek b dengan tipe objek B
        b = new B();
        System.out.println("Mengawali Testing Untuk Kelas B");
    }
      /*
    * method testCase1 berisi untuk menguji kebenaran nilai
    * yang dihasilkan dari method add dalam kelas B
    */
      @Test
    public void testCase1() {
        double jum = b.mul(4,2);
        assertTrue("Seharusnya benar", jum == 8 );
    }    
     /*
    * method testCase2 berisi untuk menguji kebenaran nilai
    * yang dihasilkan dari method div dalam kelas B
    */
      @Test
    public void testCase2() {
        double jum = b.div(10, 2);
        assertTrue("Seharusnya benar", jum == 5);
    } 
     /* method endTest akan dieksekusi setelah pengujian selesai dilakukan
     * sebagai penanda bahwa testing telah selesai dilakukan
     */
   @After
    public void endTest() {
        System.out.println("Mengakhiri Testing Untuk Kelas B ");
    }  
}
