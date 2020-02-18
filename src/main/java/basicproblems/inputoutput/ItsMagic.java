package basicproblems.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        System.out.println(itsMagic.returnIndex(numbers1));
    }
}
