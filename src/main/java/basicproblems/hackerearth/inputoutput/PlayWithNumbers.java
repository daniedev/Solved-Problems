package basicproblems.hackerearth.inputoutput;

import basicproblems.FastReader;

import java.io.IOException;

/*Problem Url:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/play-with-numbers-2/

Problem Description:
        You are given an array of n numbers and q queries.
        For each query you have to print the floor of the expected value(mean) of the subarray from L to R.

        Input:
        First line contains two integers N and Q denoting number of array elements and number of queries.
        Next line contains N space seperated integers denoting array elements.
        Next Q lines contain two integers L and R(indices of the array).

        Output:
        print a single integer denoting the answer.

        Constraints:
        1<= N ,Q,L,R <= 10^6
        1<= Array elements <= 10^9

        NOTE
        Use Fast I/O

        SAMPLE INPUT
        5 3
        1 2 3 4 5
        1 3
        2 4
        2 5
        SAMPLE OUTPUT
        2
        3
        3*/

public class PlayWithNumbers {

    public static void main(String[] args) throws IOException {

        FastReader scan = new FastReader();
        int sizeOfArray = scan.nextInt();
        int numberOfQueries = scan.nextInt();
        long[] inputNumbers = new long[sizeOfArray];
        StringBuilder stringBuilder = new StringBuilder();
        inputNumbers[0] = scan.nextInt();
        for (int itr = 1; itr < sizeOfArray; itr++)
            inputNumbers[itr] = inputNumbers[itr - 1] + scan.nextInt();

        for (int itr = 0; itr < numberOfQueries; itr++) {
            int lowerLimit = scan.nextInt() - 1;
            int upperLimit = scan.nextInt() - 1;
            int divisor = upperLimit - lowerLimit + 1;
            if (lowerLimit == 0)
                stringBuilder.append((inputNumbers[upperLimit] / (divisor)) + "\n");
            else
                stringBuilder.append(((inputNumbers[upperLimit] - inputNumbers[lowerLimit - 1]) / (divisor)) + "\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
