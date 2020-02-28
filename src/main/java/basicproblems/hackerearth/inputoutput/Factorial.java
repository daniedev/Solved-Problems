/**Problem URL: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/

Problem Description:
        You have been given a positive integer N. You need to find and print the Factorial of this number.
        The Factorial of a positive integer N refers to the product of all number in the range from 1 to N.
        You can read more about the factorial of a number here.

        Input Format:
        The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

        Output Format
        Output a single line denoting the factorial of the number N.

        Constraints

        SAMPLE INPUT
        2
        SAMPLE OUTPUT
        2*/

package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;

public class Factorial {

    public int findFactorial(int number) {

        int answer = 1;

            while (number > 1) {
                answer = answer * number;
                number--;
            }

        return answer;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Factorial factorial = new Factorial();
        int number = keyboard.nextInt();
        System.out.println(factorial.findFactorial(number));
    }
}
