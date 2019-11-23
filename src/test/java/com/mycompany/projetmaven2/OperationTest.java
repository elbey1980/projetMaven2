/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetmaven2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
       int a =0;
       int b=0;
       int res = Operation.add(a, b);
        assertEquals(res, a+b);
    }
    
    @Test
    public void testSomeMethod2() {
       int a =4;
       int b=3;
       int res = Operation.add(a, b);
        assertEquals(res, a+b);
    }
    
    
     @Test
    public void testSomeMethod3() {
       int a =4;
       int b=3;
       int res = Operation.add(a, b);
        assertEquals(res, a+b);
    }
}
