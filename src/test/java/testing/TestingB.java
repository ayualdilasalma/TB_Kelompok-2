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
    private B b;
    @Before
     public void startTest() {
        // inisialisasi objek b dengan tipe objek B
        b = new B();
        System.out.println("Mengawali Testing Untuk Kelas B");
    }
      @Test
    public void testCase1() {
        double jum = b.mul(4,2);
        assertTrue("Seharusnya benar", jum == 8 );
    }    
      @Test
    public void testCase2() {
        double jum = b.div(10, 2);
        assertTrue("Seharusnya benar", jum == 5);
    }  
   @After
    public void endTest() {
        System.out.println("Mengakhiri Testing Untuk Kelas B ");
    }  
}
