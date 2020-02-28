/**
Problem URL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/

Problem Description:
        Roy wants to change his profile picture on Facebook.
        Now Facebook has some restriction over the dimension of picture that we can upload.
        Minimum dimension of the picture can be L x L, where L is the length of the side of square.

        Now Roy has N photos of various dimensions.
        Dimension of a photo is denoted as W x H
        where W - width of the photo and H - Height of the photo

        When any photo is uploaded following events may occur:

        [1] If any of the width or height is less than L, user is prompted to upload another one.
            Print "UPLOAD ANOTHER" in this case.
        [2] If width and height, both are large enough and
        (a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
        (b) else user is prompted to crop it. Print "CROP IT" in this case.

        (quotes are only for clarification)

        Given L, N, W and H as input, print appropriate text as output.

        Input:
        First line contains L.
        Second line contains N, number of photos.
        Following N lines each contains two space separated integers W and H.

        Output:
        Print appropriate text for each photo in a new line.

        Constraints:
        1 <= L,W,H <= 10000
        1 <= N <= 1000

        SAMPLE INPUT:

        180
        3
        640 480
        120 300
        180 180

        SAMPLE OUTPUT:

        CROP IT
        UPLOAD ANOTHER
        ACCEPTED
*/
package basicproblems.hackerearth.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndProfilePicture {

    public String accepted = "ACCEPTED";
    public String uploadAnother = "UPLOAD ANOTHER";
    public String cropIt = "CROP IT";

    private int minimumDimension = 180;

    public String isPhotoValid(int width, int height) {
        if (width >= minimumDimension && height >= minimumDimension) {
            if (width == height)
                return accepted;
            else
                return cropIt;
        } else
            return uploadAnother;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        RoyAndProfilePicture royAndProfilePicture = new RoyAndProfilePicture();
        royAndProfilePicture.minimumDimension = Integer.parseInt(bufferedReader.readLine());
        int numberOfPhotos = Integer.parseInt(bufferedReader.readLine());
        int[][] photoDimensions = new int[numberOfPhotos][2];
        for (int itr = 0; itr < numberOfPhotos; itr++) {
            String dimensions = bufferedReader.readLine();
            String[] dimArray = dimensions.split(" ");
            photoDimensions[itr][0] = Integer.parseInt(dimArray[0]);
            photoDimensions[itr][1] = Integer.parseInt(dimArray[1]);
        }
        for (int itr = 0; itr < numberOfPhotos; itr++) {
            System.out.println(royAndProfilePicture.isPhotoValid(photoDimensions[itr][0], photoDimensions[itr][1]));
        }
    }
}
