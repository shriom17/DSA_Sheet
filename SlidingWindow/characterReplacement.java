class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character, Integer> map=new HashMap<>();
        int left=0;
        int ans=0;
        int maxFreq=0;
        for(int right=0; right<n; right++)
        {
            char st = s.charAt(right);
            map.put(st, map.getOrDefault(st,0)+1);
            maxFreq = Math.max(maxFreq,map.get(st));
            while((right - left + 1) - maxFreq > k)
            {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
