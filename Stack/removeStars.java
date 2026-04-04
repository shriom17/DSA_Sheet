class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '*')
            {
               if(!st.isEmpty())
               {
                    st.pop();
               }
               
            }
            else
            {
                st.push(c);
            }
           
        }
         StringBuilder result = new StringBuilder();
        for(char ch : st) {
            result.append(ch);
        }

        return result.toString();
    }
}
