//Brute force Method
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

//Optimized
class Solution {
    public int maxWater(int arr[]) {
        // code here
      int n = arr.length;
      int res = 0;
      int[] leftmax = new int[n];
      int[ ] rightmax = new int[n];
      leftmax[0]=arr[0];
      rightmax[n-1]=arr[n-1];
      
      for(int i=1; i<n; i++)
      {
          leftmax[i] = Math.max(leftmax[i-1],arr[i]);
      }
      
      for(int i=n-2; i>=0; i--)
      {
          rightmax[i] = Math.max(rightmax[i+1],arr[i]);
      }
      
      for(int i=0; i<n; i++)
      {
          res = res + Math.min(leftmax[i], rightmax[i]) - arr[i];
      }
     
      return res;
    }
}
