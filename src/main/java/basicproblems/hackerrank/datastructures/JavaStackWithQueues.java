package basicproblems.hackerrank.datastructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class JavaStackWithQueues {
    private boolean isBalanced(String input) {
        HashMap<Character, Character> validBrackets = new HashMap<>();
        validBrackets.put('(', ')');
        validBrackets.put('{', '}');

        if (input.length() % 2 != 0) {
            return false;
        }
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int itr = 0; itr < input.length(); itr++) {
            Character currentCharacter = input.charAt(itr);
            if (validBrackets.containsKey(currentCharacter)) {
                deque.push(currentCharacter);
            } else if (deque.isEmpty() || currentCharacter != validBrackets.get(deque.pop()))
                return false;
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JavaStackWithQueues javaStackWithQueues = new JavaStackWithQueues();
        while (scanner.hasNext()) {
            System.out.println(javaStackWithQueues.isBalanced(scanner.next()) ? "true" : "false");
        }
    }
}
