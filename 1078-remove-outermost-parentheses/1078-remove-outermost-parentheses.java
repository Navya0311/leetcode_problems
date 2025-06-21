import java.util.*;

class Solution {
    public String removeOuterParentheses(String st) {
        int len = st.length();
        if (len <= 2) {
            return "";
        }
        Stack<Character> s = new Stack<>();
        int count = 0;
        char ch[] = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                count++;
                if (count > 1) {
                    s.push(ch[i]);
                }
            } else if (ch[i] == ')') {
                count--;
                if (count > 0)
                    s.push(ch[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : s) {
            result.append(c);
        }
        return result.toString();
    }
}