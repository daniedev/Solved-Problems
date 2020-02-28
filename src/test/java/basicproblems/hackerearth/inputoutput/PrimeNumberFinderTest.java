package basicproblems.hackerearth.inputoutput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberFinderTest {

    PrimeNumberFinder subject;
    boolean result;

    @Before
    public void setSubject() {
        subject = new PrimeNumberFinder();
    }

    @Test
    public void checkForPrime_onGivingPrimeNumber_returnsTrue() {
        result = subject.checkForPrime(2);
        Assert.assertTrue(result);
    }

    @Test
    public void checkForPrime_onGivingNonPrimeNumber_returnsFalse() {
        result = subject.checkForPrime(4);
        Assert.assertFalse(result);
    }

    @Test
    public void checkForPrime_onGivingZero_returnsFalse() {
        result = subject.checkForPrime(0);
        Assert.assertFalse(result);

    }

    @Test
    public void checkForPrime_onGivingOne_returnsFalse() {
        result = subject.checkForPrime(1);
        Assert.assertFalse(result);
    }

    @Test
    public void checkForPrime_onGivingNegativeNumber_returnsFalse() {
        result = subject.checkForPrime(-19);
        Assert.assertFalse(result);

    }

    @Test
    public void givePrimeNumbers_givingNumber_returnsAllPossiblePrimeNumbers() {
        String result = " 2 3 5";
        Assert.assertEquals(result, subject.givePrimeNumbers(6));
    }


}