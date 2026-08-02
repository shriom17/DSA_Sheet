class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // remove spaces
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        // sign
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if(s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        int num = 0;

        while(i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // overflow check
            if(num > (Integer.MAX_VALUE - digit) / 10) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;

            i++;
        }

        return num * sign;
    }
}
