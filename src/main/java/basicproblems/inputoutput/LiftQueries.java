package basicproblems.inputoutput;

import java.util.Scanner;

/**Problem URL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/lift-queries/

Problem Description:
        There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor.
        Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up.
        If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.

        INPUT
        First line contains a integer T denoting the number of test cases.
        Next T lines contains a single integer N denoting the floor from which lift is called.

        OUTPUT
        Output T lines containing one character "A" if the first lift goes to N th floor or "B" for the second lift.

        CONTRAINTS
        0 <= N <= 7
        1 <= T <= 100000

        SAMPLE INPUT
        2
        3
        5

        SAMPLE OUTPUT
        A
        A*/

public class LiftQueries {

    public int currentPositionOfLiftA = 0;
    public int currentPositionOfLiftB = 7;


    public String allotLift(int floorNumber){
        int distanceOfFloorFromLiftA = floorNumber - currentPositionOfLiftA;
        int distanceOfFloorFromLiftB = currentPositionOfLiftB - floorNumber;
        if(distanceOfFloorFromLiftA == distanceOfFloorFromLiftB || distanceOfFloorFromLiftA < distanceOfFloorFromLiftB) {
            currentPositionOfLiftA = floorNumber;
            return "A";
        }
        else {
            currentPositionOfLiftB = floorNumber;
            return "B";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiftQueries liftQueries = new LiftQueries();
        int numberOfTestCases = scanner.nextInt();
        String[] resultArray = new String[numberOfTestCases];
        for (int itr = 0;itr < numberOfTestCases; itr++){
            resultArray[itr] = liftQueries.allotLift(scanner.nextInt());
        }
        for(String result : resultArray)
            System.out.println(result);
    }
}
