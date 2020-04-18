package basicproblems.hackerearth.implementation;

import java.io.DataInputStream;
import java.io.IOException;

/*Problem Url:
        https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/

Problem Description:
        This time your task is simple.
        Given two integers X and K, find the largest number that can be formed by changing digits at atmost K places in the number X.

        Input:
        First line of the input contains two integers X and K separated by a single space.

        Output:
        Print the largest number formed in a single line.

        Constraints:
        0 <= X <= 10^18
        0 <= K <= 9

        SAMPLE INPUT
        4483 2

        SAMPLE OUTPUT
        9983*/

public class DigitProblem {
    final private int BUFFER_SIZE = 1 << 16;
    private int bufferPointer = 0, bytesRead = 0;
    private byte[] buffer = new byte[BUFFER_SIZE];
    private DataInputStream din = new DataInputStream(System.in);

    public int nextInt() {
        int n = 0;
        boolean neg = false;
        int c;
        while ((c = read()) <= ' ') ;
        neg = c == '-';
        if (neg) {
            c = read();
        }
        do {
            n = n * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (c == 13) {
            read();
        }
        return neg ? -n : n;
    }

    public long nextLong() {
        long n = 0;
        boolean neg = false;
        int c;
        while ((c = read()) <= ' ') ;
        neg = c == '-';
        if (neg) {
            c = read();
        }
        do {
            n = n * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (c == 13) {
            read();
        }
        return neg ? -n : n;
    }

    public byte read() {
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }
        return buffer[bufferPointer++];
    }

    private void fillBuffer() {
        try {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLargestNumber(String input, int numberOfModificationsAllowed) {
        StringBuilder stringBuilder = new StringBuilder();
        int numberOfModificationsRemaining = numberOfModificationsAllowed;
        int currentIndex = 0;
        while (numberOfModificationsRemaining > 0) {
            if (input.charAt(currentIndex) != '9') {
                numberOfModificationsRemaining--;
            }
            stringBuilder.append(9);
            currentIndex++;
        }
        stringBuilder.append(input.substring(currentIndex));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        DigitProblem digitProblem = new DigitProblem();
        Long givenNumber = digitProblem.nextLong();
        int numberOfModificationsAllowed = digitProblem.nextInt();
        System.out.println(digitProblem.getLargestNumber(givenNumber.toString(), numberOfModificationsAllowed));
    }
}
