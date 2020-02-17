package basicproblems.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivisorsTest {

    CountDivisors subject;

    @Before
    public void setUp() throws Exception {
        subject = new CountDivisors();
    }

    @Test
    public void findNumberOfDivisors() {
        int result = subject.findNumberOfDivisors(1,15,3);
        assertEquals(5,result);
    }
}