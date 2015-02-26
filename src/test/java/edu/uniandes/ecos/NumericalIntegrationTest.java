/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import junit.framework.TestCase;

/**
 *
 * @author ASUS-PC
 */
public class NumericalIntegrationTest extends TestCase {
    
    public NumericalIntegrationTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of calculateGamma method, of class NumericalIntegration.
     */
    public void testCalculateGamma() {
        System.out.println("calculateGamma");
        int num = 10;
        int den = 2;
        NumericalIntegration instance = new NumericalIntegration();
        double expResult = 24;
        double result = instance.calculateGamma(num, den);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateGammaNonInteger method, of class NumericalIntegration.
     */
    public void testCalculateGammaNonInteger() {
        System.out.println("calculateGammaNonInteger");
        long num = 9;
        long den = 2;
        NumericalIntegration instance = new NumericalIntegration();
        double expResult = 11.63173;
        double result = instance.calculateGammaNonInteger(num, den);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFactorial method, of class NumericalIntegration.
     */
    public void testCalculateFactorial() {
        System.out.println("calculateFactorial");
        int value = 4;
        NumericalIntegration instance = new NumericalIntegration();
        double expResult = 24;
        double result = instance.calculateFactorial(value);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFunction method, of class NumericalIntegration.
     */
    public void testCalculateFunction() {
        System.out.println("calculateFunction");
        int dof = 9;
        double value = 1.1;
        NumericalIntegration instance = new NumericalIntegration();
        double expResult = 0.20652;
        double result = instance.calculateFunction(dof, value);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIntegralValue method, of class NumericalIntegration.
     */
    public void testCalculateIntegralValue() {
        System.out.println("calculateIntegralValue");
        int numSeg = 10;
        double x = 1.1;
        int dof = 9;
        NumericalIntegration instance = new NumericalIntegration();
        double expResult = 0.0;
        double result = instance.calculateIntegralValue(numSeg, x, dof);
        assertEquals(expResult, result, 0.35005864);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
