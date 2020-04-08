package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;

/**
Problem Url:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/ladderophilia/

Problem Description:
        Aditya is fond of ladders.
        Everyday he goes through pictures of ladders online but unfortunately today he ran out of ladder pictures online.
        Write a program to print “ladder with N steps”, which he can use to get his daily dose of ladder love.

        INPUT:
        Input contains integer N, the number of steps in the ladder

        OUTPUT:
        Print the ladder with the gap between two side rails being 3 spaces(“   “).
        Check the sample output for format of printing the ladder.

        CONSTRAINTS:
        1<=N<=40

        SAMPLE INPUT
        4
        SAMPLE OUTPUT
        *   *
        *   *
        *****
        *   *
        *   *
        *****
        *   *
        *   *
        *****
        *   *
        *   *
        *****
        *   *
        *   *
*/

public class Ladderophilia {
    private final String STEP = "*****\n";
    private final String SIDERAIL = "*   *\n*   *\n";
    private final String BOTTOM_SIDERAIL = "*   *\n*   *";

    public String buildLadder(int numberOfSteps) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int itr = 1; itr <= numberOfSteps; itr++){
            stringBuilder.append(SIDERAIL);
            stringBuilder.append(STEP);
        }
        stringBuilder.append(BOTTOM_SIDERAIL);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Ladderophilia ladderophilia = new Ladderophilia();
        Scanner scanner = new Scanner(System.in);
        System.out.println(ladderophilia.buildLadder(scanner.nextInt()));
    }
}
