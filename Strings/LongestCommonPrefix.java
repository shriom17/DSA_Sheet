class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        //  empty string check
        for (String s : strs) {
            if (s.length() == 0) return "";
        }

        String prefix = "";
        int index = 0;

        while (true) {
            char ch = strs[0].charAt(index);

            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != ch) {
                    return prefix;
                }
            }

            prefix = prefix + ch;
            index++;

            //  first string length exceeded check
            if (index >= strs[0].length()) break;
        }

        return prefix;
    }
}
