/**Problem URL: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/

Problem Description:
        You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k.
        You do not need to print these numbers, you just have to find their count.

        Input Format
        The first and only line of input contains 3 space separated integers l, r and k.

        Output Format
        Print the required answer on a single line.*/

package basicproblems.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisors {

    public int findNumberOfDivisors(int number1, int number2, int divisor) {
        int answer = 0;
        for (int itr = number1; itr <= number2; itr++) {
            if (itr % divisor == 0)
                answer = answer + 1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        CountDivisors countDivisors = new CountDivisors();
        String[] input = keyboard.readLine().split(" ");
        int number1 = Integer.parseInt(input[0]);
        int number2 = Integer.parseInt(input[1]);
        int divisor = Integer.parseInt(input[2]);

        System.out.println(countDivisors.findNumberOfDivisors(number1, number2, divisor));
    }

}
