class Solution {
    public static String infixToPostfix(String s) {
        
        Stack<Character> st = new Stack<>();
        String ans = "";
        
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            // Operand
            if(Character.isLetterOrDigit(ch)) {
                ans += ch;
            }
            
            // Opening bracket
            else if(ch == '(') {
                st.push(ch);
            }
            
            // Closing bracket
            else if(ch == ')') {
                while(!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                
                st.pop(); // remove '('
            }
            
            // Operator
            else {
                while(!st.isEmpty() && st.peek() != '(' &&
                      (precedence(st.peek()) > precedence(ch) ||
                      (precedence(st.peek()) == precedence(ch) && ch != '^'))) {
                    
                    ans += st.pop();
                }
                
                st.push(ch);
            }
        }
        
        // Remaining operators
        while(!st.isEmpty()) {
            ans += st.pop();
        }
        
        return ans;
    }
    
    static int precedence(char ch) {
        
        if(ch == '^')
            return 3;
        
        if(ch == '*' || ch == '/')
            return 2;
        
        if(ch == '+' || ch == '-')
            return 1;
        
        return 0;
    }
}
