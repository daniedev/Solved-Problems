/**
 * Problem URL: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */

package basicproblems.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProduct {

    public long findProduct(int[] arrayOfNumbers) {

        long answer = 1;
        long M = 1000000007;

        for (int number : arrayOfNumbers) {
            answer = (answer * number) % M;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        FindProduct findProduct = new FindProduct();

        int sizeOfArray = Integer.parseInt(keyboard.readLine());
        String numbers = keyboard.readLine();
        String[] arrayOfNumbers = numbers.split(" ");

        int[] numbers1 = new int[sizeOfArray];
        for (int itr = 0; itr < sizeOfArray; itr++)
            numbers1[itr] = Integer.parseInt(arrayOfNumbers[itr]);

        System.out.println(findProduct.findProduct(numbers1));
    }
}
