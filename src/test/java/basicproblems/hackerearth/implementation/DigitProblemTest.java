package basicproblems.hackerearth.implementation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitProblemTest {

    DigitProblem subject;

    @Before
    public void setUp() {
        subject = new DigitProblem();
    }

    @Test
    public void getLargestNumber_ifModificationRangeDoesNotHaveNine_providesLargestNumber() {
        String inputNumber = "4433";
        int numberOfModificationsAllowed = 2;
        assertEquals("9933", subject.getLargestNumber(inputNumber, numberOfModificationsAllowed));
    }

    @Test
    public void getLargestNumber_ifModificationRangeDoesHaveNine_providesLargestNumber() {
        String inputNumber = "4933";
        int numberOfModificationsAllowed = 2;
        assertEquals("9993",subject.getLargestNumber(inputNumber,numberOfModificationsAllowed));
    }

    @Test
    public void getLargestNumber_ifGivenNumberIsLong_providesLargestNumber() {
        String inputNumber = "242358001399388784";
        int numberOfModificationsAllowed = 9;
        assertEquals("999999999399388784",subject.getLargestNumber(inputNumber,numberOfModificationsAllowed));
    }

}