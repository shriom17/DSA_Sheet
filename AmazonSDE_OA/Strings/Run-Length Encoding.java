class Solution {
    public String encode(String s) {

        StringBuilder ans = new StringBuilder();

        int count = 1;

        for(int i = 1; i < s.length(); i++) {

            if(s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else {
                ans.append(s.charAt(i-1));
                ans.append(count);

                count = 1;
            }
        }

        // last character
        ans.append(s.charAt(s.length()-1));
        ans.append(count);

        return ans.toString();
    }
}
