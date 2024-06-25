/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author pc 1
 */
public class RequestTest {

     public RequestTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPropertyId method, of class Request.
     */
    @Test
    public void testGetPropertyId() {
        System.out.println("getPropertyId");
        Request instance = new Request();
        Long expResult = null;
        Long result = instance.getPropertyId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPropertyId method, of class Request.
     */
    @Test
    public void testSetPropertyId() {
        System.out.println("setPropertyId");
        Long propertyId = null;
        Request instance = new Request();
        instance.setPropertyId(propertyId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetails method, of class Request.
     */
    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        Request instance = new Request();
        String expResult = "";
        String result = instance.getUserDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserDetails method, of class Request.
     */
    @Test
    public void testSetUserDetails() {
        System.out.println("setUserDetails");
        String userDetails = "";
        Request instance = new Request();
        instance.setUserDetails(userDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}