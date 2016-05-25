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
 * @author dilacim
 */
public class TestingA {
    
    private A a;

    @Before
    public void awalTest() {
        a = new A();
        System.out.println("Mengawali Testing");
    }
    
    @Test
    public void testNull() {
        assertNull("Tidak boleh null", a.add(0, 1));
    }
    
    @Test
    public void testNotEquals() {
        assertNotEquals("Tidak sama", a.add(3, 4), a.add(4, 3));
    }
    
    
}
