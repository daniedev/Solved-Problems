package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AliAndHelpingInnocentPeopleTest {

    AliAndHelpingInnocentPeople subject;

    @Before
    public void setUp() throws Exception {
        subject = new AliAndHelpingInnocentPeople();
    }

    @Test
    public void isTagValid_ifLetterIsVowel_shouldReturnInvalid() {
        char[] tagArray = "13A222-79".toCharArray();
        String result = subject.isTagValid(tagArray);
        assertEquals("invalid",result);
    }

    @Test
    public void isTagValid_ifConditionsSatisfied_shouldReturnValid(){
        char[] tagArray = "13B157-22".toCharArray();
        String result = subject.isTagValid(tagArray);
        assertEquals("valid",result);
    }


    @Test
    public void isTagValid_allNumbersOddOrEven_shouldReturnValid(){
        char[] tagArray = "22B222-22".toCharArray();
        String result = subject.isTagValid(tagArray);
        assertEquals("valid",result);

        tagArray = "11G111-11".toCharArray();
        result = subject.isTagValid(tagArray);
        assertEquals("valid",result);
    }
}