package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EMazeInTest {

    private EMazeIn subject;

    @Before
    public void setSubject() {
        subject = new EMazeIn();
    }

    @Test
    public void returnFinalPosition() {
        String command = "LLRDDR";
        String expectedResult = "0 -2";
        String actualResult = subject.returnFinalPosition(command);
        assertEquals(expectedResult, actualResult);
    }
}