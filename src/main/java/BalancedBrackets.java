import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    public boolean isBalancedBrackets(String expression) {
        final char[][] TOKEN = {{'{', '}'}, {'[', ']'}, {'(', ')'}};
        if (expression == null || expression.isEmpty()) { //*** StringUtils.isEmpty <<
            return true;
        } else {
            Deque<Character> stack = new ArrayDeque<>();
            outer: for (char c : expression.toCharArray()) {
                // Add open bracket to the stack
                if (c == TOKEN[0][0] || c == TOKEN[1][0] || c == TOKEN[2][0]) {
                    stack.push(c);
                } else {
                    for (char[] charArray : TOKEN) { // {'0','1'}
                        if (c == charArray[1]) {
                            if (stack.isEmpty()) {
                                // This case it will never be balanced if the first bracket added to the stack is closed
                                stack.push(c);
                                break outer; //*** break the outer loop
                            } else if (stack.peek() == charArray[0]) {
                                stack.pop();
                            } else {
                                stack.push(c);
                            }
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
