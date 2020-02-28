/**Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams.
   Any characters can be deleted from either of the strings.

 Input :
     test cases,t
     two strings a and b, for each test case
     Output:
     Desired O/p
     Constraints :
     string lengths<=10000
     Note :
     Anagram of a word is formed by rearranging the letters of the word.
     For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
     SAMPLE INPUT
     1
     cde
     abc

 SAMPLE OUTPUT
 4

 */

package basicproblems.hackerearth.inputoutput;
import java.util.Scanner;

public class Anagrams {

    private static class WordsContainer {
        String word1 = "", word2 = "";
    }

    public int findSimilarNumberOfLetters(String firstWord, String secondWord) {

        int count = 0;

        char[] word1 = firstWord.toCharArray();
        char[] word2 = secondWord.toCharArray();

        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word2.length; j++) {
                if (word1[i] == word2[j]) {
                    count++;
                    word2[j] = 0;
                    break;
                }
            }
        }
        return count;
    }

    public int makeAnagram(String word1, String word2) {
        int numberOfSimilarLetters = findSimilarNumberOfLetters(word1, word2);
        return word1.length() + word2.length() - 2 * numberOfSimilarLetters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anagrams anagrams = new Anagrams();
        int numberOfTestCases = input.nextInt();
        WordsContainer[] wordsContainer = new WordsContainer[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {
            wordsContainer[i] = new WordsContainer();
            wordsContainer[i].word1 = input.next();
            wordsContainer[i].word2 = input.next();
        }

        for (WordsContainer container : wordsContainer) {
            System.out.println(anagrams.makeAnagram(container.word1, container.word2));
        }
    }
}