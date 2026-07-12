class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character, Integer>map = new HashMap<>();
        int n = s.length();
        int left = 0;
        int right = 0;
        int ans = 0;
        
        while(right<n)
        {
            char ch = s.charAt(right);
            
            if(map.containsKey(ch)) 
            {
                left=Math.max(left,map.get(ch)+1);
                map.put(ch, right);
                right++;
            }
            else
            {
                map.put(ch, right);
                right++;
            }
            
            ans = Math.max(ans, right-left);
        }
        
        return ans;
    }
}
