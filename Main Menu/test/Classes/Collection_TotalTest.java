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
public class Collection_TotalTest {
    
    public Collection_TotalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of AddCard method, of class Collection_Total.
     */
    @Test
    public void testAddCard() {
        System.out.println("AddCard");
        Card c = new Card(2.00f,"Near Mint");
        Collection_Total instance = new Collection_Total();
        instance.AddCard(c);
    }

    /**
     * Test of getCollectionTotal method, of class Collection_Total.
     */
    @Test
    public void testGetCollectionTotal() {
        System.out.println("getCollectionTotal");
        Collection_Total instance = new Collection_Total();
        Float expResult = 0.0f;
        Float result = instance.getCollectionTotal();
        assertEquals(expResult, result);
    }
    
}
