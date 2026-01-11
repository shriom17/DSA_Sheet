class Solution {
    public int reverseBits(int n) {
        int[] ans = new int[32];
        int index=0;
       for(int i=31; i>=0; i--)
       {
          int k=n>>>i;
          if((k&1)>0)
          {
            ans[index]=1;
            index++;
          }
          else
          {
            ans[index]=0;
            index++;
          }
       }
      int res = 0;
        for(int i=0; i<32; i++) {
            res = (res << 1) | (n & 1);
            n >>>= 1;
        }
        return res;

    }
}
