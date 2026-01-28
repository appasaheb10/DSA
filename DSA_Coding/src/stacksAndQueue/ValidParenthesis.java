package stacksAndQueue;

import java.util.HashMap;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false
 */

class ValidParenthesis {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.containsKey(curr)) {
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if (pop != map.get(curr)) {
                    return false;
                }
            } else {
                stack.push(curr);
            }
        }

        return stack.isEmpty();
    }
}
// TC: O(n), SC: O(n)
