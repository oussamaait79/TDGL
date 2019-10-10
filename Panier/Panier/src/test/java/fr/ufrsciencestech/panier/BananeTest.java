/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author af433882
 */
public class BananeTest {
    private Banane mok1;
    
    public BananeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        mok1 = new Banane(0.5,"France");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Banane instance = mok1;
        double expResult = 0.50;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Banane instance = mok1;
        String expResult = "France";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.60;
        Banane instance = mok1;
        try {
            instance.setPrix(prix);
        } catch (Exception ex) {
            Logger.getLogger(BananeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        double result = instance.getPrix();
        assertEquals(prix, result,0.0);


    }
      @Test (expected=Exception.class)
    public void testSetPrixNegatif() {
        Banane instance = mok1;
        double prix = -0.60;
        instance.setPrix(prix);
    }
    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "Espagne";
        Banane instance = mok1;
        instance.setOrigine(origine);

    }
    
}
