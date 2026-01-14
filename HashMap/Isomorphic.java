class Solution {
    public boolean isIsomorphic(String s, String t) {
        // mapping from s_char -> t_char
        HashMap<Character, Character> map = new HashMap<>();
        // set to keep track of t_char already mapped
        HashSet<Character> usedChars = new HashSet<>();
        
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            
            if(map.containsKey(s_char)) {
                // s_char seen before → check mapping
                if(map.get(s_char) != t_char) {
                    return false; // conflict
                }
            } else {
                // s_char not seen before → check t_char bijective
                if(usedChars.contains(t_char)) {
                    return false; // t_char already mapped to another s_char
                }
                map.put(s_char, t_char);     // add mapping
                usedChars.add(t_char);       // mark t_char as used
            }
        }
        
        return true; // no conflicts, isomorphic
    }
}
