class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1]=1;
        int prod = 1;
        for(int i=1; i<n; i++)
        {
            prod = prod * arr[i-1];
            left[i] = prod;
        }
        prod = 1;
        for(int i=n-2; i>=0; i--)
        {
            prod = prod * arr[i+1];
            right[i] = prod;
        }
        
        for(int i=0; i<n; i++)
        {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
