/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.junit;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NameConverterParamTest {
 
    private static String[][] TEST_CASES = new String[][]{{"A  pples", "apples"}, {"ApplesAndOranges", "apples_and_oranges"}, {"", ""}, {"JUnit", "j_unit"}, {"DevX", "dev_x"}};
    private String input;
    private String expected;
 
    public NameConverterParamTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }
 
    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList((Object[][]) TEST_CASES);
    }
 
    @BeforeClass
    public static void setUpClass() {
    }
 
    /**
     * Test of camelToUnderscore method, of class NameConverter.
     */
    @Test
    public void testCamelToUnderscore() {
        System.out.println("camelToUnderscore '" + input + "' to '" + expected + "'");
        Assume.assumeFalse(input.contains(" "));
        String result = NameConverter.camelToUnderscore(input);
        assertEquals(expected, result);
    }
}      