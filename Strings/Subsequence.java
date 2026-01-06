class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int index=0;
       while(i<t.length() && index<s.length())
        {
            if(s.charAt(index)==t.charAt(i))
            {
                index++;
                i++;
            }
            else
            {
                i++;
            }
        }
        if(index==s.length())
        {
            return true;
        }
        return false;
    }
}
