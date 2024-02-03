package example.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character symbol = s.charAt(i);

            if (Arrays.asList('{', '(', '[').contains(symbol)) {
                stack.push(symbol);
            }

            try {
                if (symbol == '}') {
                    if (stack.peek() == symbol - 2) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (symbol == ']') {
                    if (stack.peek() == symbol - 2) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (symbol == ')') {
                    if (stack.peek() == symbol - 1) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            } catch (Exception e) {
                return false;
            }

        }
        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {

        String[] inputs = {"()", "()[]{}", "(]", "]", "){"};
        for (String input : inputs) {
            System.out.println(input + " : " + isValid(input));
        }

    }
}
