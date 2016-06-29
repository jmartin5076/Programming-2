/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremy
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue1() {
        System.out.println("getValue");
        Card instance = new Card(2.00f,"Near Mint");
        Float expResult = 10.0f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetValue2() {
        System.out.println("getValue");
        Card instance = new Card(2.00f,"Lightly Played");
        Float expResult = 4.0f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetValue3() {
        System.out.println("getValue");
        Card instance = new Card(2.00f,"Moderately Played");
        Float expResult = 2.0f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetValue4() {
        System.out.println("getValue");
        Card instance = new Card(2.00f,"Heavily Played");
        Float expResult = 1.0f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetValue5() {
        System.out.println("getValue");
        Card instance = new Card(2.00f,"Damaged");
        Float expResult = 0.5f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
}
