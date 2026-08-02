class Solution {
    public static int kthLargest(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-k];
    }
}
