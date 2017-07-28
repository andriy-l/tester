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
        String expected = Integer.toOctalString(testValue);
        assertEquals("Tested values for " + testValue, expected, calculator.convertFromDecimalToOctal(testValue));

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
    @Test
    public void multiplication() throws Exception {
        double result = calculator.multiplication(2,3);
        assertEquals(6, result, 0.1);
    }

    

}
