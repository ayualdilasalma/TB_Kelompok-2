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
 * @author ayu aldila salma
 */
public class TestingA {
    
    private A a;

    @Before
    public void startTest() {
        a = new A();
        System.out.println("Mengawali Testing Untuk Kelas A");
    }
    
    @Test
    public void testNull() {
        assertNotNull("Tidak boleh null", a.add(0, 0));
    }
    
    @Test
    public void testEquals() {
        assertEquals("Seharusnya bernilai sama", 4, a.sub(7, 3));
    }
    
    @After
    public void endTest() {
        System.out.println("Mengakhiri Testing Untuk Kelas A ");
    }
    
}
