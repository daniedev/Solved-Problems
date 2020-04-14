package basicproblems.hackerearth.implementation;

/*Problem Url:
        https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/print-hackerearth/

Problem Description:
        As a beginner to the programming, Mishki came to Hackerearth platform, to become a better programmer.
        She solved some problems and felt very confident. Later being a fan of Hackerearth, she gave a problem to her friends to solve.
        They will be given a string containing only lower case characters (a-z), and they need to find that by using the characters of the given string,
        how many times they can print "hackerearth"(without quotes). As they are new to programming world, please help them.

        Input:
        The first line will consists of one integer 'N' denoting the length of string.
        Next line will contain the string 'str' containing only lower case characters.

        Output:
        Print one integer, denoting the number of times her friends can print "hackerearth" (without quotes).

        Constraints:
        Each character of string 'str' will be in range [a to z]

        SAMPLE INPUT
        13
        aahkcreeatrha

        SAMPLE OUTPUT
        1*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHackerEarth {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        char[] inputWord = bufferedReader.readLine().toCharArray();

        //Identify the count of each letters
        int a = 0, c = 0, e = 0, h = 0, k = 0, r = 0, t = 0;
        for (char value : inputWord) {
            switch (value) {
                case 'a':
                    a++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'h':
                    h++;
                    break;
                case 'k':
                    k++;
                    break;
                case 'r':
                    r++;
                    break;
                case 't':
                    t++;
                    break;
            }
        }

        // Determine the smallest among a,e,h,r
        int minimumCountOfLettersWithTwoOccurrences = 0;
        if (a < e) {
            if (a < h) {
                if (a < r) {
                    minimumCountOfLettersWithTwoOccurrences = a;
                } else {
                    minimumCountOfLettersWithTwoOccurrences = r;
                }
            } else {
                if (h < r) {
                    minimumCountOfLettersWithTwoOccurrences = h;
                } else {
                    minimumCountOfLettersWithTwoOccurrences = r;
                }
            }
        } else {
            if (e < h) {
                if (e < r) {
                    minimumCountOfLettersWithTwoOccurrences = e;
                } else {
                    minimumCountOfLettersWithTwoOccurrences = r;
                }
            } else {
                if (h < r) {
                    minimumCountOfLettersWithTwoOccurrences = h;
                } else {
                    minimumCountOfLettersWithTwoOccurrences = r;
                }
            }
        }

        // Determine the smallest among c,k,t
        int minimumCountOfLettersWithOneOccurrence = 0;
        if (c < k) {
            if (c < t)
                minimumCountOfLettersWithOneOccurrence = c;
            else
                minimumCountOfLettersWithOneOccurrence = t;
        } else {
            if (k < t)
                minimumCountOfLettersWithOneOccurrence = k;
            else
                minimumCountOfLettersWithOneOccurrence = t;
        }

        // Determine number of words.
        int numberOfWords = 0;
        if(minimumCountOfLettersWithOneOccurrence > 0) {
            if (minimumCountOfLettersWithTwoOccurrences / (2 * minimumCountOfLettersWithOneOccurrence) >= 1)
                numberOfWords = minimumCountOfLettersWithOneOccurrence;
            else
                numberOfWords = minimumCountOfLettersWithTwoOccurrences / 2;
        }
        System.out.println(numberOfWords);
    }
}
