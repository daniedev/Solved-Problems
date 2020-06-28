package basicproblems.hackerrank.datastructures;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int hourGlassSum;
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 4; column++) {
                hourGlassSum = arr[row][column] + arr[row - 1][column - 1] + arr[row - 1][column] + arr[row - 1][column + 1] +
                        arr[row + 1][column - 1] + arr[row + 1][column] + arr[row + 1][column + 1];
                maximumSum = Math.max(hourGlassSum, maximumSum);
                hourGlassSum = 0;
            }
        }
        System.out.println(maximumSum);
    }
}
