package example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {

        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('}', '{');
        parenthesesMap.put(']', '[');
        parenthesesMap.put(')', '(');
        if (s.isEmpty() || s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character symbol = s.charAt(i);

            if (Arrays.asList('{', '(', '[').contains(symbol)) {
                stack.push(symbol);
            }

            if (parenthesesMap.containsKey(symbol)) {
                if (stack.isEmpty()) return false;
                if (stack.peek() == parenthesesMap.get(symbol)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String[] inputs = {"()", "()[]{}", "(]", "]", "){","{[()]}"};
        for (String input : inputs) {
            System.out.println(input + " : " + isValid(input));
        }
    }
}
