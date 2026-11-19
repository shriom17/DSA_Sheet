class Solution {
    public int countSubstrings(String s) {
        int c = 0;

        for(int i = 0; i < s.length(); i++) {

            // Odd length
            int L = i;
            int R = i;

            while(L >= 0 && R < s.length() &&
                  s.charAt(L) == s.charAt(R)) {
                c++;
                L--;
                R++;
            }

            // Even length
            L = i;
            R = i + 1;

            while(L >= 0 && R < s.length() &&
                  s.charAt(L) == s.charAt(R)) {
                c++;
                L--;
                R++;
            }
        }

        return c;
    }
}
