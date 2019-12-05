

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    //@RunWith attaches a runner with the test class to initialise the test data.

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd(){
        when(calcService.addition(10.0, 20.0)).thenReturn(30.00);

        Assert.assertEquals(mathApplication.addition(10.0, 20.0),30.00,0);
    }
    @Test
    public void testMinus(){
        when(calcService.subtract(10.0,20.0)).thenReturn(-10.0);

        Assert.assertEquals(mathApplication.subtract(10.0,20.0), -10.0, 1.0);
    }
    @Test
    public void testDivide(){
        when(calcService.divide(10.0,5)).thenReturn(2.0);

        Assert.assertEquals(mathApplication.divide(10.0,5.0),2.0,0.1);
    }
    @Test
    public void testMultiply(){
        when(calcService.multiply(10.0,2.0)).thenReturn(20.0);

        Assert.assertEquals(mathApplication.multiply(10.0,2.0), 20.0, 0.1);
    }
}
