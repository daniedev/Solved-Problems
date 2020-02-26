package basicproblems.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LiftQueriesTest {

    LiftQueries subject;

    @Before
    public void setUp() throws Exception {
        subject = new LiftQueries();
    }

    @Test
    public void allotLift_ifFloorIsEquidistantFromBothLifts_sendLiftA(){
        subject.currentPositionOfLiftA = 1;
        subject.currentPositionOfLiftB = 7;
        assertEquals("A",subject.allotLift(4));
        subject.currentPositionOfLiftA = 0;
        assertNotEquals("A",subject.allotLift(4));

    }

    @Test
    public void allotLift_ifFloorIsCloseToLiftA_sendLiftA(){
        subject.currentPositionOfLiftA = 1;
        subject.currentPositionOfLiftB = 6;
        for(int floorNumber = 2; floorNumber < 4; floorNumber++)
        assertEquals("A",subject.allotLift(floorNumber));
    }

    @Test
    public void allotLift_ifFloorIsCloseToLiftB_sendLiftB(){
        subject.currentPositionOfLiftA = 1;
        subject.currentPositionOfLiftB = 6;
        for(int floorNumber = 4; floorNumber <=6; floorNumber++)
            assertEquals("B",subject.allotLift(floorNumber));
    }

    @Test
    public void allotLift_onContinousOperation_shouldReturnCorrectLift(){
        subject.currentPositionOfLiftA = 0;
        subject.currentPositionOfLiftB = 7;
        assertEquals("B",subject.allotLift(4));
        assertEquals("A",subject.allotLift(2));
    }

}