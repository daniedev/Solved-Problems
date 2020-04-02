package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;

/*Problem Url:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/

Problem Description:

    Jack is your friend and Sophia is his girlfriend.But due to some unknown reason(unknown for us,they know it)Sophia started hating to Jack.
    Now,Jack is in big trouble but he has a solution,
    He knows that if he will gift T patterns of a particular type(For pattern observation see the sample test cases)then Sophia will start loving again to Jack.
    But Jack is depressed now and need your help to gift her that type patterns of'*'and'#'of N lines.So,it's your responsibility to save your friend's relationship.


            Constraints:
            1 ≤  T ≤ 100
            1 ≤  N ≤ 30

            Input:
            First Line contains T i.e.number of test case.
            Each of the next T lines contain an integer N.

            Output:
            For each test case print the pattern of N lines then after a blank line.

            SAMPLE INPUT
            3
            9
            2
            5

            SAMPLE OUTPUT
            *################*
            **##############**
            ***############***
            ****##########****
            *****########*****
            ******######******
            *******####*******
            ********##********
            ******************

            *##*
            ****

            *########*
            **######**
            ***####***
            ****##****
            ***********/

public class FriendsRelationship {
    private StringBuilder finalPattern = new StringBuilder();

    public String generateOutput(int inputValue) {
        finalPattern.setLength(0);
        for (int itr = 1; itr <= inputValue; itr++) {
            executeRepeatedAppending(itr, "*");
            executeRepeatedAppending(2 * (inputValue - itr), "#");
            executeRepeatedAppending(itr, "*");
            finalPattern.append("\n");
        }
        return finalPattern.toString();
    }

    private void executeRepeatedAppending(int numberOfTimes, String value) {
        for (int itr = 1; itr <= numberOfTimes; itr++) {
            finalPattern.append(value);
        }
    }

    public static void main(String[] args) {
        FriendsRelationship friendsRelationship = new FriendsRelationship();
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int itr = 1; itr <= numberOfTestCases; itr++) {
            System.out.println(friendsRelationship.generateOutput(scanner.nextInt()));
        }
    }
}
