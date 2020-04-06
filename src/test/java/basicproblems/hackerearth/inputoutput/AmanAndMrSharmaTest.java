package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmanAndMrSharmaTest {

    private AmanAndMrSharma subject;

    @Before
    public void setSubject() {
        subject = new AmanAndMrSharma();
    }

    @Test
    public void isToffeeEarnedThatDay_ifAmanCapableOfCompletingRound_returnsTrue() {
        assertTrue(subject.isToffeeEarnedInThatDay(3, 2));
    }

    @Test
    public void isToffeeEarnedThatDay_ifAmanNotCapableOfCompletingRound_returnsFalse() {
        assertFalse(subject.isToffeeEarnedInThatDay(35, 2));
    }
}