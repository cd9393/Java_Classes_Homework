import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    int num1;
    int num2;
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
         num1 = 5;
         num2 = 8;
    }

    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(40, calculator.multiply(num1, num2));
    }

    @Test
    public void canAdd(){
        assertEquals(13, calculator.add(num1, num2));
    }

    @Test
    public void canSubtract(){
        assertEquals(-3, calculator.subtract(num1,num2));
    }

    @Test
    public void canDivide(){
        double number1 = 9.0;
        double number2 = 2.0;
        assertEquals(4.5, calculator.divide(number1, number2), 0.01);
    }

}
