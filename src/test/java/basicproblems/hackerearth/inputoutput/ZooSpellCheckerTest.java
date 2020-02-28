package basicproblems.hackerearth.inputoutput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ZooSpellCheckerTest {

    ZooSpellChecker subject;
    @Before
    public void setUp() throws Exception {
        subject = new ZooSpellChecker();
    }

    @Test
    public void checkForPropotion_onGivingWordWithExactProption_returnsTrue(){
        Assert.assertTrue(subject.checkForPropotion("zzzoooooo"));
    }

    @Test
    public void checkForPropotion_onGivingWordWithInAdequateProption_returnsFalse(){
        Assert.assertFalse(subject.checkForPropotion("zzzooooooo"));
    }

    @Test
    public void checkForProption_onGivingWordGreaterThanTwentyCharacters_returnsFalse(){
        Assert.assertFalse(subject.checkForPropotion("zzzzzzzoooooooooooooo"));
    }
}