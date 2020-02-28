/**
Problem URL :
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/its-magic/

Problem Description :
        ussutu is a world-renowned magician.
        And recently, he was blessed with the power to remove EXACTLY ONE element from an array.

        Given, an array A (index starting from 0) with N elements.
        Now, Sussutu CAN remove only that element which makes the sum of ALL the remaining elements exactly divisible by 7.

        Throughout his life, Sussutu was so busy with magic that he could never get along with maths.
        Your task is to help Sussutu find the first array index of the smallest element he CAN remove.

        Input:
        The first line contains a single integer N.
        Next line contains N space separated integers Ak , 0 < k < N.

        Output:
        Print a single line containing one integer, the first array index of the smallest element he CAN remove, and -1 if there is no such element that he can remove!

        Constraints:

        1 < N < 105

        0 < Ak < 109

        SAMPLE INPUT
        5
        14 7 8 2 4
        SAMPLE OUTPUT
        1
*/

package basicproblems.hackerearth.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ItsMagic {

    private long total = 0;

    public int returnIndex(int[] inputNumbers) {
        int resultIndex = -1;
        int resultNumber = 2147483647;
        getTotal(inputNumbers);

        for (int itr = 0; itr < inputNumbers.length; itr++) {
            if ((total - inputNumbers[itr]) % 7 == 0 && inputNumbers[itr] < resultNumber) {
                resultIndex = itr;
                resultNumber = inputNumbers[itr];
            }
        }
        return resultIndex;
    }

    public int returnIndexV2(int[] inputNumbersArray) {
        int result = -1;
        ArrayList<InputNumber> inputNumbersList = new ArrayList<>();

        for (int itr1 = 0; itr1 < inputNumbersArray.length; itr1++) {
            inputNumbersList.add(new InputNumber(inputNumbersArray[itr1], itr1));
        }

        inputNumbersList.sort(InputNumber.sortByValue);
        getTotal(inputNumbersArray);

        for (InputNumber number : inputNumbersList) {
            if ((total - number.getValue()) % 7 == 0) {
                result = number.getIndex();
                break;
            }
        }
        return result;
    }

    private void getTotal(int[] inputNumbers) {
        for (int number : inputNumbers) {
            total = total + number;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int sizeOfArray = Integer.parseInt(keyboard.readLine());
        String numbers = keyboard.readLine();
        String[] arrayOfNumbers = numbers.split(" ");
        int[] numbers1 = new int[sizeOfArray];
        for (int itr = 0; itr < sizeOfArray; itr++)
            numbers1[itr] = Integer.parseInt(arrayOfNumbers[itr]);

        ItsMagic itsMagic = new ItsMagic();
        System.out.println(itsMagic.returnIndexV2(numbers1));
    }

    private static class InputNumber {

        int value;
        int index;

        int getValue() {
            return value;
        }

        int getIndex() {
            return index;
        }

        InputNumber(int value, int index) {
            this.value = value;
            this.index = index;
        }

        static Comparator<InputNumber> sortByValue = (number, t1) -> {
            int number1 = number.getValue();
            int number2 = t1.getValue();

            return number1 - number2;
        };

    }
}
