/**
 * Problem Description:

 * You are required to enter a word that consists of X and Y that denote the number of Zs and Os respectively.
 * The input word is considered similar to word zoo if 2 * X = Y.

 * Determine if the entered word is similar to word zoo.

 * For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

 * Input format

 * First line: A word that starts with several Zs and continues by several Os.
 * Note: The maximum length of this word must be 20.

 * Output format

 * Print Yes if the input word can be considered as the string zoo otherwise, print No.

  SAMPLE INPUT
  zzzoooooo

  SAMPLE OUTPUT
  Yes

 * Link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
 */

package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZooSpellChecker {

    public boolean checkForPropotion(String word) {

        if (word.length() <= 20) {
            Pattern pattern = Pattern.compile("o *");
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                String phrase1 = word.substring(0, matcher.start());
                String phrase2 = word.substring(matcher.end()).concat("o");
                return 2 * phrase1.length() == phrase2.length();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ZooSpellChecker zooSpellChecker = new ZooSpellChecker();
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String result = "No";
        if (zooSpellChecker.checkForPropotion(word))
            result = "Yes";
        System.out.println(result);
    }


}
