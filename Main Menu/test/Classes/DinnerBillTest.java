/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.DinnerBill;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremy
 */
public class DinnerBillTest {
    
    public DinnerBillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTotal method, of class DinnerBill.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        DinnerBill instance = new DinnerBill();
        Float expResult = 0.0f;
        Float result = instance.getTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPercent method, of class DinnerBill.
     */
    @Test
    public void testGetPercent() {
        System.out.println("getPercent");
        DinnerBill instance = new DinnerBill();
        Float expResult = 0.0f;
        Float result = instance.getPercent();
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculateTip method, of class DinnerBill.
     */
    @Test
    public void testCalculateTip() {
        System.out.println("CalculateTip");
        float total = 20.0F;
        float percent = 15.0F;
        DinnerBill instance = new DinnerBill();
        Float expResult = 3.0f;
        Float result = instance.CalculateTip(total, percent);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculateTotal method, of class DinnerBill.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("CalculateTotal");
        float total = 20.0F;
        float tip = 3.0F;
        DinnerBill instance = new DinnerBill();
        Float expResult = 23.0f;
        Float result = instance.CalculateTotal(total, tip);
        assertEquals(expResult, result);
    }
    
}
