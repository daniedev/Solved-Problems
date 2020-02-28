package basicproblems.hackerearth.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BricksGameTest {

    private BricksGame subject;
    private String patlu = "Patlu";
    private String motu = "Motu";

    @Before
    public void setSubject() {
        subject = new BricksGame();
    }

    @Test
    public void personToPickTheBrick_currentBrickPickedInPatluTurn_returnPatlu() {
        for (int i = 1; i < 2; i++) {
            String actualResult = subject.personToPickTheBrick(i);
            assertEquals(patlu, actualResult);
        }

        for (int i = 4; i < 6; i++) {
            String actualResult = subject.personToPickTheBrick(i);
            assertEquals(patlu, actualResult);
        }

        for (int i = 10; i < 12; i++) {
            String actualResult = subject.personToPickTheBrick(i);
            assertEquals(patlu, actualResult);
        }
    }

   @Test
    public void personToPickTheBrick_currentBrickPickedInMotuTurn_returnMotu() {
       for (int i = 2; i < 4; i++) {
           String actualResult = subject.personToPickTheBrick(i);
           assertEquals(motu, actualResult);
       }

       for (int i = 7; i < 10; i++) {
           String actualResult = subject.personToPickTheBrick(i);
           assertEquals(motu, actualResult);
       }

       for (int i = 13; i < 19; i++) {
           String actualResult = subject.personToPickTheBrick(i);
           assertEquals(motu, actualResult);
       }
    }

    @Test
    public void personToPickTheBrick_currentBrickPicked_equalToNumberOfBricksPickedInPreviousRound_returnsCorrectPerson() {
        int currentBrickPicked;
        String actualResult;

        currentBrickPicked = 1;
        actualResult = subject.personToPickTheBrick(currentBrickPicked);
        assertEquals(patlu, actualResult);

        currentBrickPicked = 9;
        actualResult = subject.personToPickTheBrick(currentBrickPicked);
        assertEquals(motu, actualResult);

        currentBrickPicked = 18;
        actualResult = subject.personToPickTheBrick(currentBrickPicked);
        assertEquals(motu, actualResult);
    }
}