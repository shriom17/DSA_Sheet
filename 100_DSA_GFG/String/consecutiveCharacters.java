class Solution {
    public int maxPower(String s) {
        int count = 1;
        int maxx = 1;
        for(int i=1; i<s.length(); i++)
        {
            char previous=s.charAt(i-1);
            char current=s.charAt(i);
            if(current==previous)
            {
                count=count+1;
            }
            else
            {
                count=1;
            }
            maxx=Math.max(count,maxx);
        }

        return maxx;
    }
}
