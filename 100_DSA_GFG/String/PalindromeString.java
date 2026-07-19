class Solution {
    public boolean isPalinSent(String s) {
        // code here
        int n=s.length();
        int left=0;
        int right=n-1;
        
        while(left<right)
        {
            char l=s.charAt(left);
            if(Character.isLetterOrDigit(l))
            {
                l=Character.toLowerCase(l);
            }
            else
            {
                left++;
                continue;
            }
            char r=s.charAt(right);
            if(Character.isLetterOrDigit(r))
            {
                r=Character.toLowerCase(r);
            }
            else
            {
                right--;
                continue;
            }
            if(l==r)
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}
