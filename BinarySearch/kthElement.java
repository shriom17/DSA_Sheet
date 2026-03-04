class Solution {
    public int kthElement(int[] a, int[] b, int k) {
      int n = a.length+b.length;
      int[] ans = new int[n];
      System.arraycopy(a, 0, ans, 0, a.length);
      System.arraycopy(b, 0, ans, a.length, b.length);
      Arrays.sort(ans);
      int i;
      for(i=1; i<=n; i++)
      {
        if(i==k-1)
        {
            break;
        }
      }
      return ans[i];
    }
}
