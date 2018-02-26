package f_unit_testing.test;

import org.junit.Assert;
import org.junit.Test;

public class HackTest {

    @Test
    public void testMathAbs(){
        int positive = 5;
        double negative = -5.5;

        Assert.assertEquals(5, Math.abs(positive));
        Assert.assertEquals(5.5, Math.abs(negative), 0.00001);
    }

    @Test
    public void testSystemLineSeparator(){
        String lineSeparator = System.lineSeparator();
        Assert.assertEquals("\r\n", lineSeparator);
    }




}
