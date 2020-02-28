package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;

/**Problem URL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/bricks-game-5140869d/

Problem Description:
        Patlu and Motu works in a building construction,
        they have to put some number of bricks N from one place to another,
        and started doing their work.

        They decided , they end up with a fun challenge who will put the last brick.
        They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.
        There are only N bricks, you need to help find the challenge result to find who put the last brick.

        Input:
        First line contains an integer N.

        Output:
        Output "Patlu" (without the quotes) if Patlu puts the last bricks ,
                "Motu"(without the quotes) otherwise.

        Constraints:
        1 ≤ N ≤ 10000

        SAMPLE INPUT
        13

        SAMPLE OUTPUT
        Motu
        Explanation

        Sample Explanation:
        13 bricks are there :

        Patlu Motu
        1      2
        2      4
        3      1 ( Only 1 remains)

        Hence, Motu puts the last one.*/

public class BricksGame {

    public String personToPickTheBrick(int currentBrickPicked) {
        int numberOfRoundsCompletedIdentifier = currentBrickPicked / 3;
        int numberOfRoundsCompleted = 1;
        int numberOfBricksPickedUntilPreviousRound = 1;
        while (true) {
            if (numberOfRoundsCompletedIdentifier - numberOfRoundsCompleted >= 0) {
                numberOfRoundsCompletedIdentifier = numberOfRoundsCompletedIdentifier - numberOfRoundsCompleted;
                numberOfRoundsCompleted++;
            } else {
                numberOfRoundsCompleted--;
                break;
            }
        }
        if (numberOfRoundsCompleted > 0) {
            numberOfBricksPickedUntilPreviousRound = ((numberOfRoundsCompleted * (numberOfRoundsCompleted + 1) * 3) / 2);
            if (currentBrickPicked > numberOfBricksPickedUntilPreviousRound && currentBrickPicked - (numberOfBricksPickedUntilPreviousRound + (numberOfRoundsCompleted + 1)) <= 0)
                return "Patlu";
            else
                return "Motu";
        }else
            return currentBrickPicked>numberOfBricksPickedUntilPreviousRound?"Motu":"Patlu";
    }

    public static void main(String[] args) {
        BricksGame bricksGame = new BricksGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println(bricksGame.personToPickTheBrick(scanner.nextInt()));
    }
}
