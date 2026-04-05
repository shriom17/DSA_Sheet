class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(st.isEmpty())
            {
                st.push(c);
            }
            else
            {
                char d = st.peek();
                if(c == d)
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : st)
        {
            res.append(ch);
        }
        return res.toString();
    }
}
