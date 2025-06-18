package com.sj.test;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sj.Main;



public class TestMain {

    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}