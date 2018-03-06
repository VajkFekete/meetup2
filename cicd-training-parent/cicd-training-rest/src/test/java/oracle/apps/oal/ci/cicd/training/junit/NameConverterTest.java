/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 *
 * @author vfekete
 */
public class NameConverterTest {

    public NameConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Simple test with single word input
     */
    @Test
    public void testCamelToUnderscoreSingle() {
        System.out.println("testCamelToUnderscoreSingle");
        String in = "Apples";
        String expResult = "apples";
        String result = NameConverter.camelToUnderscore(in);
        assertEquals(expResult, result);
    }

    /**
     * Two word input
     */
    @Test
    public void testCamelToUnderscoreTwoWords() {
        System.out.println("testCamelToUnderscoreTwoWords");
        String in = "TwoWords";
        String expResult = "two_words";
        String result = NameConverter.camelToUnderscore(in);
        assertEquals(expResult, result);
    }

    /**
     * Empty input
     */
    @Test
    public void testCamelToUnderscoreEmpty() {
        System.out.println("testCamelToUnderscoreEmpty");
        String in = "";
        String expResult = "";
        String result = NameConverter.camelToUnderscore(in);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testCamelToUnderscoreNull() {
        System.out.println("testCamelToUnderscoreNull");
        String in = null;
        String expResult = "";
        String result = NameConverter.camelToUnderscore(in);
        assertTrue("Method has to return NPE", false);
    }

    @Test(timeout = 100) @Ignore
    public void testCamelToUnderscore() {
        String in = "ThisIsANotThatVeryLongInputParameter";

        String expResult = "this_is_a_not_that_very_long_input_parameter";
        for (int i = 0; i < 18; i++) {
            in = in + in;
            expResult = expResult + '_' + expResult;
        }
        String result = NameConverter.camelToUnderscore(in);
        assertEquals(expResult, result);
    }

    @Rule
    public TestName testName = new TestName();
    
    @Before
    public void beforeTest(){
        System.out.println(testName.getMethodName());
    }
}
