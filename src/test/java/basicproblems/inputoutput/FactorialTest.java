package basicproblems.inputoutput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    Factorial subject;

    @Before
    public void setSubject(){
        subject = new Factorial();
    }

    @Test
    public void findFactorial_numberGreaterThanOne_returnsAnswer(){
        Assert.assertEquals(120,subject.findFactorial(5));
    }

    @Test
    public void findFactorial_numberEqualToZero_returnsOne(){
        Assert.assertEquals(1,subject.findFactorial(0));
    }


}