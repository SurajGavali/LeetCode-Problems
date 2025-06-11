public class Problem_20 {

    // https://leetcode.com/problems/valid-parentheses/description/
    public static void main(String[] args) {
        String s = "({[]})";
        boolean isValid = isValid(s);
        System.out.println("Is the string valid? " + isValid);
    }
    public static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}
