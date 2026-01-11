class Solution {
    public int residuePrefixes(String s) {
        int n = s.length();
        boolean[] seen = new boolean[26];
        int distinct = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                distinct++;
            }

            if (distinct == (i + 1) % 3) {
                c++;
            }
        }
        return c;
    }
}
©leetcode
