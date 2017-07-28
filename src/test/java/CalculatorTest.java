import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.*;

/**
 * Created by andriy on 26.07.17.
 */
public class CalculatorTest {


    Calculator calculator;
    // fixture
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void convertFromDecimalToOctal() throws Exception {

        int testValue = 10;
        int testValue2 = 11;
        String expected = Integer.toOctalString(testValue);
        String expected2 = Integer.toOctalString(testValue2);
        assertEquals("Tested values for " + testValue, expected, calculator.convertFromDecimalToOctal(testValue));
        assertEquals("Tested values for " + testValue, expected2, calculator.convertFromDecimalToOctal(testValue2));

    }

    @Test
    public void division() throws Exception {
        double result = calculator.division(10.1, 2);
        double expected = 5.05;
        assertEquals(expected, result, 0.1);
    }


    @Test
    public void add() throws Exception {
		double a = 3, b = 2;
	assertEquals("additon " + a + " and "+ b, 5.0, calculator.add(3, 2), 0.1);
    }

    public void multiplication() throws Exception {
        double result = calculator.multiplication(2,3);
        assertEquals(6, result, 0.1);
    }

    @Test
    public void isPositive() throws Exception {
        boolean result = calculator.isPositive(4);
        assertTrue("Not positive", result);
        assertFalse("Not positive", calculator.isPositive(-3));

    }

    @Test
    public void isPositive2() throws Exception {
        Assume.assumeFalse("assume Not positive", true);

    }
    
    @Ignore
    @Test(timeout = 100)
    public void isNotNull() throws Exception {
        Thread.sleep(5_000);
    }

}
