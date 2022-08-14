/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package junitg6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lorep
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int numero1 = 1;
        int numero2 = 2;
        Suma instance = new Suma();
        int expResult = 3;
        int result = instance.sumar(numero1, numero2);
        assertEquals(expResult, result);
    }

    
    
}
