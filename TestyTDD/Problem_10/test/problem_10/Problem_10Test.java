/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Slawek
 */
public class Problem_10Test {
    
    public Problem_10Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Problem_10.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Problem_10.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class Problem_10.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int n = 0;
        Problem_10 instance = new Problem_10();
        boolean expResult = false;
        boolean result = instance.isPrime(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
