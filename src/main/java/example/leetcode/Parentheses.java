package example.leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {

    private static final Map<Character, Character> parenthesesMap = new HashMap<>();

    static {
        parenthesesMap.put('}', '{');
        parenthesesMap.put(']', '[');
        parenthesesMap.put(')', '(');
    }

    public static boolean isValid(String s) {


        if (s.isEmpty() || s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character symbol = s.charAt(i);

            if (parenthesesMap.containsValue(symbol)) {
                stack.push(symbol);
            } else if (parenthesesMap.containsKey(symbol)) {
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

        String[] inputs = {"()", "()[]{}", "(]", "]", "){", "{[()]}", "{[()(){}]{}}"};
        for (String input : inputs) {
            System.out.println(input + " : " + isValid(input));
        }
    }
}
