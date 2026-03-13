class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n != 4) {
            int s = 0;

            while(n > 0) {
                int d = n % 10;
                s = s + d*d;
                n = n / 10;
            }

            n = s;
        }

        return n == 1;
    }
}
