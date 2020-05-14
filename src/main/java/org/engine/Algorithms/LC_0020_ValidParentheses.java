package org.engine.Algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Stack;

@Slf4j
public class LC_0020_ValidParentheses {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * Example 1:
     * Input: "()"
     * Output: true
     *
     * Example 2:
     * Input: "()[]{}"
     * Output: true
     *
     * Example 3:
     * Input: "(]"
     * Output: false
     *
     * Example 4:
     * Input: "([)]"
     * Output: false
     *
     * Example 5:
     * Input: "{[]}"
     * Output: true
     *
     * @Author BugDeveloper
     * @Description
     * @Date 下午 07:28 2020/5/14
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
//        String str = "()";
//        String str = "()[]{}";
//        String str = "(]";
//        String str = "([)]";
        String str = "{[]}";
        log.info("target:{} is valid:{}", str, isValid(str));
    }

    /*
     * Runtime: 2 ms, faster than 24.84% of Java online submissions for Valid Parentheses.
     * Memory Usage: 37.9 MB, less than 5.06% of Java online submissions
     * for Valid Parentheses.
     */
    public static boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        } else {
            Boolean res = true;
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                String x = s.substring(i, i + 1);
                if (stack.empty()) {
                    stack.push(x);
                } else {
                    if ("(".equals(x))
                        stack.push(x);
                    else if ("[".equals(x))
                        stack.push(x);
                    else if ("{".equals(x))
                        stack.push(x);
                    else {
                        String y = "";
                        if (")".equals(x))
                            y = "(";
                        else if ("]".equals(x))
                            y = "[";
                        else if ("}".equals(x))
                            y = "{";
                        if (stack.search(y) != 1) {
                            res = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }
            }
            if (!stack.empty())
                res = false;
            return res;
        }
    }
//---------------------------------------Other Programmer Solution Started---------------------------------------
    /*
     * Runtime: 1 ms, faster than 98.66% of Java online submissions for Valid Parentheses.
     * Memory Usage: 37.5 MB, less than 5.06% of Java online submissions
     * for Valid Parentheses.
     */
    public boolean otherProgramerSolution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
//---------------------------------------Other Programmer Solution Started---------------------------------------
//---------------------------------------LeetCode Solution Started---------------------------------------
    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public LC_0020_ValidParentheses() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    /*
     * Runtime: 1 ms, faster than 98.66% of Java online submissions for Valid Parentheses.
     * Memory Usage: 37.5 MB, less than 5.06% of Java online submissions
     * for Valid Parentheses.
     */
    public boolean leetCodeSolution(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
//---------------------------------------LeetCode Solution End---------------------------------------
}
