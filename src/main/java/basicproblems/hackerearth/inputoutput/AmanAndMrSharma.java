package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;
/**
Problem Url:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/aman-mrsharma/

Problem Description:
        On a distant planet far away from Earth lives a boy named Aman.He loves to run everyday.
        But his running distance is directly affected by how much horlicks his mother mixed in his milk today.
        If his mother has mixed x grams of horlicks,then Aman will be capable of running 100*x meters at most on that day.

        Aman's instructor, Mr.Sharma ,is a very strict yet very caring.
        Everyday he asks Aman to run around a circle of radius r once.
        If Aman is able to complete the circle,he would get a toffee.

        Note:Take value of pie=22/7.

        CONSTRAINTS:
        1<=d<105
        1<=r<106
        1<=x<=104

        INPUT:
        First line contains d,no. of days Aman goes to his instructor.Next d lines each contain r,radius of circle and x,amount of horlicks.

        OUTPUT:
        Print total number of toffees Aman would finally have at the end of d days.

        SAMPLE INPUT
        3
        3 2
        5 2
        1 2

        SAMPLE OUTPUT
        3
*/
//TODO : Reduce Time Consumed

public class AmanAndMrSharma {
    public boolean isToffeeEarnedInThatDay(int radiusOfCircle, int amountOfHorlicksConsumed) {
        float totalRunningCapacity = 100 * amountOfHorlicksConsumed;
        float distanceToBeCoveredInOneRound = (2 * (22f / 7)) * radiusOfCircle;
        return totalRunningCapacity > distanceToBeCoveredInOneRound;
    }

    public static void main(String[] args) {
        AmanAndMrSharma amanAndMrSharma = new AmanAndMrSharma();
        Scanner scanner = new Scanner(System.in);
        int numberOfToffees = 0;
        int numberOfTestCases = scanner.nextInt();
        for (int itr = 1; itr <= numberOfTestCases; itr++) {
            if (amanAndMrSharma.isToffeeEarnedInThatDay(scanner.nextInt(), scanner.nextInt()))
                numberOfToffees++;
        }
        System.out.println(numberOfToffees);
    }
}
