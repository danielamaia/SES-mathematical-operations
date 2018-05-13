/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.up.feup.mesw.ses;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniela
 */
public class MathematicalOperationsSessionBeanRemoteTest {
    
    public MathematicalOperationsSessionBeanRemoteTest() {
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
     * Test of squareRoot method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot");
        double x = 4;
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        double expResult = 2;
        double result = instance.squareRoot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cubicRoot method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testCubicRoot() {
        System.out.println("cubicRoot");
        double x = 0.0;
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        double expResult = 0.0;
        double result = instance.cubicRoot(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of powerExponent method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testPowerExponent() {
        System.out.println("powerExponent");
        double base = 0.0;
        double exponent = 0.0;
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        double expResult = 0.0;
        double result = instance.powerExponent(base, exponent);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logarithmGivenBase method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testLogarithmGivenBase() {
        System.out.println("logarithmGivenBase");
        double x = 0.0;
        double y = 0.0;
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        double expResult = 0.0;
        double result = instance.logarithmGivenBase(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveToHistory method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testSaveToHistory() {
        System.out.println("saveToHistory");
        String x = "";
        String y = "";
        String operation = "";
        String result_2 = "";
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        instance.saveToHistory(x, y, operation, result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteHistory method, of class MathematicalOperationsSessionBeanRemote.
     */
    @Test
    public void testDeleteHistory() {
        System.out.println("deleteHistory");
        MathematicalOperationsSessionBeanRemote instance = new MathematicalOperationsSessionBeanRemoteImpl();
        instance.deleteHistory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MathematicalOperationsSessionBeanRemoteImpl implements MathematicalOperationsSessionBeanRemote {

        public double squareRoot(double x) {
            return Math.sqrt(x);
        }

        public double cubicRoot(double x) {
            return Math.cbrt(x);
        }

        public double powerExponent(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        public double logarithmGivenBase(double x, double y) {
            return Math.log(y) / Math.log(x);
        }

        @Override
        public void saveToHistory(String x, String y, String operation, String result) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public ArrayList<String> getHistory() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void deleteHistory() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    
}
