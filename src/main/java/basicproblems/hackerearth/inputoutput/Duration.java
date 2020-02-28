package basicproblems.hackerearth.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Problem Description:
        Rahul is a very busy persion he dont wan't to waste his time .
        He keeps account of duration of each and every work.
        Now he don't even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.

        Input:
        First line will be given by N number of works
        Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)

        Output:
        N lines with duration HH MM(hours and minutes separated by space)

        SAMPLE INPUT
        2
        1 44 2 14
        2 42 8 23

        SAMPLE OUTPUT
        0 30
        5 41
        */

public class Duration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases = Integer.parseInt(bufferedReader.readLine());
        int[][] detailsArray = new int[numberOfTestCases][2];
        for(int i=0;i<numberOfTestCases;i++){
            String[] detail = bufferedReader.readLine().split(" ");
            int startingTime = Integer.parseInt(detail[0] )*60+Integer.parseInt(detail[1]);
            int endingTime = Integer.parseInt(detail[2]) * 60 + Integer.parseInt(detail[3]);
            detailsArray[i][0] = Math.max((endingTime - startingTime) / 60, 0);
            detailsArray[i][1] = (endingTime - startingTime) % 60 > 0 ? (endingTime - startingTime) % 60 : (startingTime - endingTime) % 60 ;
        }
        for(int i = 0;i<numberOfTestCases;i++){
            System.out.println(detailsArray[i][0] + " " + detailsArray[i][1]);
        }
    }
}
