/**Problem Description:

        Hawkeye is a MARVEL character who has a perfect aim in archery. Its almost impossible for him to miss his aim.
        As you are the head of technical team at MARVEL , you have been assigned a very critical task.
        During practice hawkeye uses a square archery practice board. For our convenience we will assume it to be a N * N matrix.
        He shoots an arrow at position i,j with power P. Now power reduces by 1 as we move away from position i,j .
        Your task is to show the graph representing the impact of the arrow on the practice board.

        INPUT FORMAT
        First line of input contains a single integer N denoting the size of the practice board.
        Second line contains 3 integers i,j denoting position at which arrow was shot and p denoting the power used to shoot the arrow.

        OUTPUT FORMAT
        Output a 2D matrix representing the impact on the practice board.

        CONSTRAINS
        1<=N<=1000
        0<=i,j 0<=p<=109

        Note:- The matrix is zero indexed matrix ie: first element will be at 0,0
        SAMPLE INPUT
        7
        3 3 3
        SAMPLE OUTPUT
        0 0 0 0 0 0 0
        0 1 1 1 1 1 0
        0 1 2 2 2 1 0
        0 1 2 3 2 1 0
        0 1 2 2 2 1 0
        0 1 1 1 1 1 0
        0 0 0 0 0 0 0
        Explanation
        The size of the practice board is 7*7
        Hawkeye shoots an arrow at 3,3 position with power 3.
        So, at every layer the impact reduces by 1 until impact becomes 0

        Time Limit:	1.0 sec(s) for each input file.
        Memory Limit:	256 MB
        Source Limit:	1024 KB
        Marking Scheme:	Marks are awarded when all the testcases pass.
        Allowed Languages:	Bash, C, C++, C++14, Clojure, C#, D, Erlang, F#, Go, Groovy, Haskell, Java, Java 8,
        JavaScript(Rhino), JavaScript(Node.js), Julia, Kotlin, Lisp, Lisp (SBCL), Lua, Objective-C, OCaml, Octave,
        Pascal, Perl, PHP, Python, Python 3, R(RScript), Racket, Ruby, Rust, Scala, Swift, Swift-4.1, TypeScript, Visual Basic

Problem URL: https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/hawkeye-and-floodfill/
             ?utm_source=header&utm_medium=search&utm_campaign=he-search*/

package basicproblems.hackerearth.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HawkeyeAndFloodFill {
    private static int rowStart;
    private static int rowEnd;
    private static int columnStart;
    private static int columnEnd;
    private static int orderOfMatrix;
    private static int power;
    private static boolean doUpwards = true;
    private static boolean doDownwards = true;
    private static boolean doLeftWards = true;
    private static boolean doRightWards = true;

    public int[][] generateImpactOnBoard(int[][] practiceBoard) {

        generateImpactCoordinates();

        while (doUpwards || doDownwards || doLeftWards || doRightWards) {
            if (doUpwards) {
                for (int itr = columnStart; itr <= columnEnd; itr++) {
                    practiceBoard[rowStart][itr] = power;
                }
            }
            if (doDownwards) {
                for (int itr = columnStart; itr <= columnEnd; itr++) {
                    practiceBoard[rowEnd][itr] = power;
                }
            }
            if (doLeftWards) {
                for (int itr = rowStart; itr <= rowEnd; itr++) {
                    practiceBoard[itr][columnStart] = power;
                }
            }
            if (doRightWards) {
                for (int itr = rowStart; itr <= rowEnd; itr++) {
                    practiceBoard[itr][columnEnd] = power;
                }
            }

            generateImpactCoordinates();
        }
        return practiceBoard;
    }


    public void generateImpactCoordinates() {

        if (rowStart == 0)
            doUpwards = false;
        if (columnStart == 0)
            doLeftWards = false;
        if (rowEnd == orderOfMatrix - 1)
            doDownwards = false;
        if (columnEnd == orderOfMatrix - 1)
            doRightWards = false;
        if (power > 0)
            power--;

        if (doUpwards && rowStart - 1 >= 0)
            rowStart = rowStart - 1;

        if (doDownwards && rowEnd + 1 < orderOfMatrix)
            rowEnd = rowEnd + 1;

        if (doLeftWards && columnStart - 1 >= 0)
            columnStart = columnStart - 1;

        if (doRightWards && columnEnd + 1 < orderOfMatrix)
            columnEnd = columnEnd + 1;
    }

    public static void main(String args[]) throws IOException {

        HawkeyeAndFloodFill hawkeyeAndFloodFill = new HawkeyeAndFloodFill();
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int practiceBoardLength = Integer.parseInt(keyboard.readLine());
        int[][] board = new int[practiceBoardLength][practiceBoardLength];
        int xcoordinate, ycoordinate;
        String[] inputCoordinates = keyboard.readLine().split(" ");
        xcoordinate = Integer.parseInt(inputCoordinates[0]);
        ycoordinate = Integer.parseInt(inputCoordinates[1]);
        power = Integer.parseInt(inputCoordinates[2]);
        board[xcoordinate][ycoordinate] = Integer.parseInt(inputCoordinates[2]);
        rowStart = xcoordinate;
        rowEnd = xcoordinate;
        columnStart = ycoordinate;
        columnEnd = ycoordinate;
        orderOfMatrix = board.length;
        board = hawkeyeAndFloodFill.generateImpactOnBoard(board);

        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
