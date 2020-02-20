package basicproblems.inputoutput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoyAndProfilePictureTest {

    private RoyAndProfilePicture subject;

    @Before
    public void setSubject(){
        subject = new RoyAndProfilePicture();
    }

    @Test
    public void isPhotoValid_ifDimenionsHaveOneToOneRatio_returnsAccepted(){
        String expectedResult = subject.accepted;
        String actualResult = subject.isPhotoValid(360,360);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void isPhotoValid_ifDimensionsDontHaveOneToOneRatio_returnsCropIt(){
        String expectedResult = subject.cropIt;
        String actualResult = subject.isPhotoValid(270, 360);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void isPhotoValid_ifOneOfDimesnionsIsLessThanMinimumDimension_returnsUploadAnother(){
        String expectedResult = subject.uploadAnother;
        String actualResult = subject.isPhotoValid(120,240);
        assertEquals(expectedResult,actualResult);
    }

}