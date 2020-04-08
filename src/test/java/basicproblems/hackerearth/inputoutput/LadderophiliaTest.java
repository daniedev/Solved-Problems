package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LadderophiliaTest {

    Ladderophilia subject;

    @Before
    public void setSubject() {
        subject = new Ladderophilia();
    }

    @Test
    public void buildLadder_with_4_steps() {
        String expectedOutput =
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n" +
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n" +
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n" +
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n" +
                        "*   *\n" +
                        "*   *";
        String actualOutput = subject.buildLadder(4);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void buildLadder_with_1_step() {
        String expectedOutput =
                        "*   *\n" +
                        "*   *\n" +
                        "*****\n" +
                        "*   *\n" +
                        "*   *";
        String actualOutput = subject.buildLadder(1);
        assertEquals(expectedOutput,actualOutput);
    }
}