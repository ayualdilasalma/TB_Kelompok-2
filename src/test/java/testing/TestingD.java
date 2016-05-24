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
 *
 * @author Rifki
 */
public class TestingD {
    private D d;
    
    @Before
    public void awalTest() {
        d = new D();
        System.out.println("Mengawali Testing");
    }
    
    @Test
    public void testCase1() {
        assertNotSame("Seharusnya error", d.pow(2.0, 0.6), 2.6);
    }
    
    @Test
    public void testCase2() {
        assertEquals("Harusnya tidak error", d.pow(2.2, 4.5), 6.7);
    }
    
    @After
    public void setelahTest() {
        System.out.println("Mengakhiri Testing");
    }
    
}
