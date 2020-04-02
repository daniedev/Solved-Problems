package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendsRelationshipTest {

    FriendsRelationship subject;

    @Before
    public void setSubject() {
        subject = new FriendsRelationship();
    }

    @Test
    public void generateOutput_inputValue_2() {
        String expectedResult = "*##*\n****\n";
        String actualResult = subject.generateOutput(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void generateOutput_inputValue_9() {
        String expectedResult =
                        "*################*\n" +
                        "**##############**\n" +
                        "***############***\n" +
                        "****##########****\n" +
                        "*****########*****\n" +
                        "******######******\n" +
                        "*******####*******\n" +
                        "********##********\n" +
                        "******************\n";
        String actualResult = subject.generateOutput(9);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void generateOutput_inputValue_5() {
        String expectedResult =
                        "*########*\n" +
                        "**######**\n" +
                        "***####***\n" +
                        "****##****\n" +
                        "**********\n";
        String actualResult = subject.generateOutput(5);
        assertEquals(expectedResult,actualResult);
    }
}