package basicproblems.hackerearth.inputoutput;

import basicproblems.FastReader;

/**
Problem URL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

Problem Description:
        Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians.
        Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege.
        He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel.
        Determine if the tag of the truck is valid or not.

        We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

        Input Format
        The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

        Output Format
        Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

        SAMPLE INPUT
        12X345-67

        SAMPLE OUTPUT
        invalid

        Explanation
        The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).
*/

public class AliAndHelpingInnocentPeople {
    public String isTagValid(char[] tagArray) {
        String result = "invalid";
        if (isVowel(tagArray[2])) {
            if ((tagArray[0] + tagArray[1]) % 2 == 0) {
                if ((tagArray[7] + tagArray[8]) % 2 == 0) {
                    if ((tagArray[3] + tagArray[4]) % 2 == 0) {
                        if ((tagArray[4] + tagArray[5]) % 2 == 0)
                            result = "valid";
                    }
                }
            }
        }
        return result;
    }

    public boolean isVowel(char letterInTag) {
        return letterInTag != 'A' && letterInTag != 'E' && letterInTag != 'I' && letterInTag != 'O' && letterInTag != 'U' && letterInTag != 'Y';
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        AliAndHelpingInnocentPeople aliAndHelpingInnocentPeople = new AliAndHelpingInnocentPeople();
        char[] tag = fastReader.readLine().toCharArray();
        System.out.println(aliAndHelpingInnocentPeople.isTagValid(tag));
    }
}
