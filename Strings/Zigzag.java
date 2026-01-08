class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        int n=numRows;
        int inc;
        
        if (numRows==1)
        {
            return s;
        }
        for(int r=0; r<n; r++)
        {
            inc = 2*(numRows-1);
            for(int i=r; i<s.length(); i=i+inc)
            {
                ans=ans+s.charAt(i);
                int diag = i+inc-2*r;
                if(r!=0 && r!= numRows-1 && diag<s.length()) 
                {
                   ans=ans+s.charAt(diag);
                }
            }
           
        }
        return ans;
    }
}
