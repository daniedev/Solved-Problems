package basicproblems.hackerearth.inputoutput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindProductTest {

    FindProduct subject;

    @Before
    public void setUp() throws Exception {
        subject = new FindProduct();
    }

    @Test
    public void findProduct_onGivingArrayOfNumbers_returnsProduct() {
        int[] numbers = {22,54,55,88,78};
        long result = subject.findProduct(numbers);
        Assert.assertEquals(448493760,subject.findProduct(numbers));
    }
}