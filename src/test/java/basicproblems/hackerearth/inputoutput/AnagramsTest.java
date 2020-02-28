package basicproblems.hackerearth.inputoutput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramsTest {

    Anagrams subject;
    String word1,word2;

    @Before
    public void setSubject(){
        subject = new Anagrams();
    }

    @Test
    public void findSimilarNumberOfLetters_onGivingTwoEntries_returnsNumberOfSimilarLetters(){
        word1 = "dormitory";
        word2 = "dirtyroom";
        Assert.assertEquals(9,subject.findSimilarNumberOfLetters(word1,word2));

        word1 = "ttss";
        word2 = "sss";
        Assert.assertEquals(2,subject.findSimilarNumberOfLetters(word1,word2));

        word1 = "abc";
        word2 = "cde";
        Assert.assertEquals(1,subject.findSimilarNumberOfLetters(word1,word2));
    }

    @Test
    public void makeAnagram_onGivingTwoWords_returnsNumberOfLettersToBeDeletedToMakeThemAnagrams(){
        word1 = "dormitory";
        word2 = "dirtyroom";
        Assert.assertEquals(0,subject.makeAnagram(word1,word2));

        word1 = "abc";
        word2 = "cde";
        Assert.assertEquals(4,subject.makeAnagram(word1,word2));
    }

}