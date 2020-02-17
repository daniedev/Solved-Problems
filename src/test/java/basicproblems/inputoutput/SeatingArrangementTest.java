package basicproblems.inputoutput;

import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeatingArrangementTest {

    SeatingArrangement subject;
    Pair seatingArrangement;
    String windowSeat = "WS";
    String middleSeat = "MS";
    String aisleSeat = "AS";

    @Before
    public void setSubject(){
        subject = new SeatingArrangement();
    }

    @Test
    public void findSeatingArrangement_onProvidingSeatNumberWhichGivesRemainderZeroWhenDividedByTwelve_returnsCorrectSeatingArrangement(){
        seatingArrangement = subject.findSeatingArrangement(12);
        Assert.assertEquals(1,seatingArrangement.getKey());
        Assert.assertEquals(windowSeat,seatingArrangement.getValue());


        seatingArrangement = subject.findSeatingArrangement(96);
        Assert.assertEquals(85,seatingArrangement.getKey());
        Assert.assertEquals(windowSeat,seatingArrangement.getValue());
    }

    @Test
    public void findSeatingArrangement_onProvidingSeatNumberWhichGivesNonZeroRemainderWhenDividedByTwelve_returnsCorrectSeatingArrangement(){
        seatingArrangement = subject.findSeatingArrangement(19);
        Assert.assertEquals(18,seatingArrangement.getKey());
        Assert.assertEquals(windowSeat,seatingArrangement.getValue());


        seatingArrangement = subject.findSeatingArrangement(96);
        Assert.assertEquals(85,seatingArrangement.getKey());
        Assert.assertEquals(windowSeat,seatingArrangement.getValue());

        seatingArrangement = subject.findSeatingArrangement(66);
        Assert.assertEquals(67,seatingArrangement.getKey());
        Assert.assertEquals(windowSeat,seatingArrangement.getValue());

        seatingArrangement = subject.findSeatingArrangement(33);
        Assert.assertEquals(28,seatingArrangement.getKey());
        Assert.assertEquals(aisleSeat,seatingArrangement.getValue());

        seatingArrangement = subject.findSeatingArrangement(47);
        Assert.assertEquals(38,seatingArrangement.getKey());
        Assert.assertEquals(middleSeat,seatingArrangement.getValue());
    }







}