class Solution {
    public String reorganizeString(String s) {

        int[] count = new int[26];
        int maxFreq = 0;
        char maxChar = 0;

        // frequency count
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
            if (count[c - 'a'] > maxFreq) {
                maxFreq = count[c - 'a'];
                maxChar = c;
            }
        }

        // not possible case
        if (maxFreq > (s.length() + 1) / 2) return "";

        char[] result = new char[s.length()];
        int index = 0;

        // place max frequency char at even index
        while (count[maxChar - 'a'] > 0) {
            result[index] = maxChar;
            index += 2;
            count[maxChar - 'a']--;
        }

        // place remaining characters
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= s.length()) index = 1;
                result[index] = (char)(i + 'a');
                index += 2;
                count[i]--;
            }
        }

        return new String(result);
    }
}
