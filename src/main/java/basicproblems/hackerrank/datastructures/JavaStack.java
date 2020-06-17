package basicproblems.hackerrank.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public boolean isBalanced(String input) {
        Stack<Character> characters = new Stack<>();
        for (int itr = 0; itr < input.length(); itr++) {
            char currentCharacter = input.charAt(itr);
            if (currentCharacter == '(' || currentCharacter == '{') {
                characters.push(currentCharacter);
            } else {
                if (characters.empty())
                    return false;
                else {
                    char previousCharacter = characters.pop();
                    if ((currentCharacter == ')' && previousCharacter != '(') || (currentCharacter == '}' && previousCharacter != '{'))
                        return false;
                }
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        JavaStack javaStack = new JavaStack();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
            System.out.println(javaStack.isBalanced(scanner.next()) ? "true" : "false");
    }
}
