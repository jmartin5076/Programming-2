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
public class Card_PokemonTest {
    
    public Card_PokemonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getValue method, of class Card_Pokemon.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card_Pokemon instance = new Card_Pokemon(3.0f,"Near Mint");
        Float expResult = 6.0f;
        Float result = instance.getValue();
        assertEquals(expResult, result);
    }
    
}
