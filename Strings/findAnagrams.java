class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> res = new ArrayList<>();
        if(s.length()<p.length())
        {
            return res;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // p er count
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int window = p.length();

        for (int i = 0; i < s.length(); i++) {

            // add current char
            sCount[s.charAt(i) - 'a']++;

            // window beshi hole left char remove
            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

            // check match
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - window + 1);
            }
        }

        return res;

    }
}
