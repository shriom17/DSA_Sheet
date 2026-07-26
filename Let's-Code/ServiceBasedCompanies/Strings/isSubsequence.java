class Solution {
    public boolean isSubsequence(String s, String t) {
      int i=0;
      int idx=0;
      while(i<t.length() && idx<s.length())
      {
        if(s.charAt(idx)==t.charAt(i))
        {
            i++;
            idx++;
        }
        else
        {
            i++;
        }
      }

      if(s.length()==idx)
      {
        return true;
      }
      return false;
    }
}
