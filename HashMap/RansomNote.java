class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++)
        {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++)
        {
            char key = ransomNote.charAt(i);
            if(map.containsKey(key) && map.get(key)>0)
            {
                 map.put(key, map.getOrDefault(key,0)-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
