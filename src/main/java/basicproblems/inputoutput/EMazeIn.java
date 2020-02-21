package basicproblems.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Problem URL:
        https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/

Problem Description:
        Ankit is in maze. The command center sent him a string which decodes to come out from the maze.
        He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down.
        In each command he will traverse 1 unit distance in the respective direction.

        For example if he is at (2, 0) and the command is L he will go to (1, 0).

        Input:
        Input contains a single string.

        Output:
        Print the final point where he came out.

        Constraints:
        1 ≤ |S| ≤ 200

        SAMPLE INPUT
        LLRDDR

        SAMPLE OUTPUT
        0 -2  */

public class EMazeIn {
    public String returnFinalPosition(String command) {
        int xOrdinate = 0, yOrdinate = 0;
        for (int itr = 0; itr < command.length(); itr++) {
            switch (command.charAt(itr)) {
                case 'L':
                    xOrdinate--;
                    break;
                case 'R':
                    xOrdinate++;
                    break;
                case 'U':
                    yOrdinate++;
                    break;
                case 'D':
                    yOrdinate--;
                    break;
            }
        }
        return xOrdinate + " " + yOrdinate;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        EMazeIn eMazeIn = new EMazeIn();
        String command = bufferedReader.readLine();
        System.out.println(eMazeIn.returnFinalPosition(command));
    }
}
