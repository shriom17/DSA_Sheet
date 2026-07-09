class Solution {
    public int maxWater(int arr[]) {
        // code here
      int n = arr.length;
      int res = 0;
      
      for(int i=1; i<n-1; i++)
      {
          int left = arr[i];
          for(int j=0; j<i; j++)
          {
              left = Math.max(left, arr[j]);
          }
          
          int right = arr[i];
          for(int j=i+1; j<n; j++)
          {
              right = Math.max(right, arr[j]);
          }
          
          res = res + Math.min(left, right) - arr[i];
      }
      
      return res;
    }
}
