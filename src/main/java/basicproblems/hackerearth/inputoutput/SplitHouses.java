package basicproblems.hackerearth.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Problem Url:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

Problem Description:
        You live in a village. The village can be represented as a line that contains 'n' grids.
        Each grid can be denoted as a house that is marked as 'H' or a blank space that is marked as '.'.
        A person lives in each house. A person can move to a grid if it is adjacent to that person.
        Therefore, the grid must be present on the left and right side of that person.

        Now, you are required to put some fences that can be marked as 'B' on some blank spaces so that the village can be divided into several pieces.
        A person cannot walk past a fence but can walk through a house.

        You are required to divide the house based on the following rules:
        A person cannot reach a house that does not belong to that specific person.
        The number of grids each person can reach is the same and it includes the grid in which the house is situated.
        In order to show that you are enthusiastic and if there are many answers, then you are required to print the one where most fences are placed.

        Your task is to decide whether there is a possible solution. Print the possible solution.

        Input format:
        First line: An integer 'n' that represents the number of grids (1 <= n <= 20)
        Second line: 'n' characters that indicate the villages that are represented as 'H' or '.'.

        Output format:
        The output must be printed in the following format:

        First line: If possible, then print "YES" . Otherwise, print "NO" .
        Second line: If the answer is "YES", then print the way to do so.

        SAMPLE INPUT
        5
        H...H

        SAMPLE OUTPUT
        YES
        HBBBH

        Explanation
        Each person can reach 1 grid. Each person can reach his own houses only.
        Note that HB.BH also works. Each person can reach only 1 grid.
        But H..BH does not work. Because the first person can reach 3 grids but the second one can only reach 1.
        H...H does not work either. The first person can reach the second person's house which is bad.
        So you need to print HBBBH because it has the most fences.*/

@SuppressWarnings("SpellCheckingInspection")
public class SplitHouses {

    public void getHouseAlignment(String[] villageAlignment) {
        if (canHousesBeSplit(villageAlignment)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String currentGrid : villageAlignment) {
                stringBuilder.append(currentGrid.equals("H") ? "H" : "B");
            }
            System.out.println("YES\n" + stringBuilder.toString());
        } else
            System.out.println("NO");
    }

    private boolean canHousesBeSplit(String[] villageAlignment) {
        for (int itr = 0; itr < villageAlignment.length; itr++) {
            if ((itr != villageAlignment.length - 1 && villageAlignment[itr].equals("H") && villageAlignment[itr + 1].equals("H")))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        SplitHouses splitHouses = new SplitHouses();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] presentVillageAlignment = bufferedReader.readLine().split("");
        splitHouses.getHouseAlignment(presentVillageAlignment);
    }
}
