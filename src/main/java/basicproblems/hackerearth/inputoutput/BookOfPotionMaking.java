package basicproblems.hackerearth.inputoutput;

import java.util.Scanner;

/** ProblemURL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/sum-it-if-you-can-4867f851/

Problem Description:
        Harry wants to find Voldemort's potion making book but he is confused about how to get it.

        The book has a special ISBN(International Standard Book Number) which is  unique numeric book identifier only for Voldemort's book printed on it.
        The ISBN is based upon a 10-digit code. The ISBN is valid if:
        1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
        Help Harry to find the book!

        Input:
        Input the ISBN code as a 10-digit integer.

        Output:
        If the ISBN is not a 10-digit integer, output the message “Illegal ISBN” and terminate the program.
        If the number is 10-digit, extract the digits of the number and compute the sum as explained in the explanation.
        If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.

        SAMPLE INPUT
        1401601499
        SAMPLE OUTPUT
        Legal ISBN
        Explanation
        For an ISBN 1401601499
        Sum=1×1 + 2×4 + 3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.*/

public class BookOfPotionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputISBNCode = scanner.nextLine();
        if (inputISBNCode.length() == 10) {
            int sumOfNumbersInCode = 0;
            for (int itr = 0; itr < inputISBNCode.length(); itr++) {
                sumOfNumbersInCode += inputISBNCode.charAt(itr) * (itr + 1);
            }
            if (sumOfNumbersInCode % 11 == 0) {
                System.out.println("Legal ISBN");
            } else {
                System.out.println("Illegal ISBN");
            }
        } else
            System.out.println("Illegal ISBN");
    }
}
