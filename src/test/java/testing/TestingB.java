/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import com.kelompok2.tugasbesar.rkppl.B;

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
    
}
