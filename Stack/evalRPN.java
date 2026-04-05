import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            // check if operator
            if(token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/")) {

                int b = st.pop();   // last
                int a = st.pop();   // second last

                int ans = 0;

                if(token.equals("+")) {
                    ans = a + b;
                } else if(token.equals("-")) {
                    ans = a - b;
                } else if(token.equals("*")) {
                    ans = a * b;
                } else if(token.equals("/")) {
                    ans = a / b;
                }

                st.push(ans); // push result back

            } else {
                // number case
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop(); // final answer
    }
}
