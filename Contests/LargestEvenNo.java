class Solution {
    public String largestEven(String s) {
        int n = s.length();
        String ans="";
        for(int i=n-1; i>=0; i--)
        {
           if(s.charAt(i) == '2')
           {
                ans = s.substring(0,i+1);
                break;
           }
        }
        return ans;
    }
}
