package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItsMagicTest {

    ItsMagic subject;

    @Before
    public void setUp() throws Exception {
        subject = new ItsMagic();
    }

    @Test
    public void returnIndex_shouldReturnCorrectIndex() {
        int[] numbers = {14,7,8,2,4};
        int result = subject.returnIndex(numbers);
        assertEquals(1,result);
    }

    @Test
    public void returnIndex_ifExpectedNumberIsPresentBeforeOtherNumbersSatisfyingGivenCondition_shouldReturnCorrectIndex(){
        int[] numbers = {2,7,8,14,4};
        int result = subject.returnIndex(numbers);
        assertEquals(1,result);
    }

    @Test
    public void returnIndex_ifInputArraySizeIsGreaterAndNumbersPresentIsAlsoGreater_shouldReturnCorrectIndex(){
        int[] numbers = new int[10000000];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = numbers.length - i;
        }
        int result = subject.returnIndex(numbers);
        assertEquals(9999994,result);
    }

    @Test
    public void returnIndexV2_shouldReturnCorrectIndex() {
        int[] numbers = {14,7,8,2,4};
        int result = subject.returnIndexV2(numbers);
        assertEquals(1,result);
    }

    @Test
    public void returnIndexV2_ifExpectedNumberIsPresentBeforeOtherNumbersSatisfyingGivenCondition_shouldReturnCorrectIndex(){
        int[] numbers = {2,7,8,14,4};
        int result = subject.returnIndexV2(numbers);
        assertEquals(1,result);
    }

    @Test
    public void returnIndexV2_ifInputArraySizeIsGreaterAndNumbersPresentIsAlsoGreater_shouldReturnCorrectIndex(){
        int[] numbers = new int[10000000];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = numbers.length - i;
        }
        int result = subject.returnIndexV2(numbers);
        assertEquals(9999994,result);
    }

}