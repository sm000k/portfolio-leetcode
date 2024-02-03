package example.leetcode;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {

    private static final Map<Character, Character> PARENTHESES_MAP = initialiseMap();

    private static Map<Character, Character> initialiseMap() {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        return Collections.unmodifiableMap(map);
    }

    public static boolean isValid(String s) {

        if (s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character symbol = s.charAt(i);

            if (PARENTHESES_MAP.containsValue(symbol)) {
                stack.push(symbol);
            } else if (PARENTHESES_MAP.containsKey(symbol)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == PARENTHESES_MAP.get(symbol)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String[] inputs = {"()", "()[]{}", "(]", "]", "){", "{[()]}", "{[()(){}]{}}"};
        for (String input : inputs) {
            System.out.println(input + " : " + isValid(input));
        }
    }
}
