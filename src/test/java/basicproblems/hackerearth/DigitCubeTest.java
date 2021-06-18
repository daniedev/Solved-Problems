package basicproblems.hackerearth;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.*;

public class DigitCubeTest {

    private static DigitCube subject;

    @BeforeAll
    static void setUp()  {
        subject = new DigitCube();
    }

    @Test
    public void findCubeOfSumOfDigits_returnsCubeOfSumOfDigits() {
        long result = subject.findCubeOfSumOfDigits(27);
        assertEquals(729, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/digitcube/DigitCubeTestData1.csv", numLinesToSkip = 1, delimiterString = " ")
    public void calculateCubeOfaNumberBasedOnRepetitionIndex_onUsingTestData1_returnsExpectedValues(int number, int repetitionIndex, int expectedValue) {
        long result = subject.calculateCubeOfSumOfDigitsOfaNumberBasedOnRepetitionIndex(number,repetitionIndex);
        assertEquals(expectedValue, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/digitcube/DigitCubeTestData2.csv", numLinesToSkip = 1, delimiterString = " ")
    public void calculateCubeOfaNumberBasedOnRepetitionIndex_onUsingTestData2_returnsExpectedValues(int number, int repetitionIndex, int expectedValue) {
        long result = subject.calculateCubeOfSumOfDigitsOfaNumberBasedOnRepetitionIndex(number,repetitionIndex);
        assertEquals(expectedValue, result);
    }
}