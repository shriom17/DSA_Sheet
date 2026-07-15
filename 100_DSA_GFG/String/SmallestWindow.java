class Solution {
    public static String minWindow(String s, String p) {
        String ans = "";
        
        HashMap<Character, Integer> needMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
       
        for(int i = 0; i < p.length(); i++)
        {
            char ch = p.charAt(i);
            
            if(needMap.containsKey(ch))
            {
                needMap.put(ch, needMap.get(ch) + 1);
            }
            else
            {
                needMap.put(ch, 1);
            }
        }
        
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(right < s.length())
        {
            char c = s.charAt(right);
            
            if(windowMap.containsKey(c))
            {
                windowMap.put(c, windowMap.get(c) + 1);
            }
            else
            {
                windowMap.put(c, 1);
            }
            
            right++;
            
            boolean valid = true;
            
            for(char key : needMap.keySet())
            {
                if(!windowMap.containsKey(key) || 
                   windowMap.get(key) < needMap.get(key))
                {
                    valid = false;
                    break;
                }
            }
            
            while(valid)
            {
                if(right - left < minLen)
                {
                    minLen = right - left;
                    ans = s.substring(left, right);
                }
                
                char leftChar = s.charAt(left);
                
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                
                left++;
                
                valid = true;
                
                for(char key : needMap.keySet())
                {
                    if(!windowMap.containsKey(key) || 
                       windowMap.get(key) < needMap.get(key))
                    {
                        valid = false;
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}
