class Solution {
    public void reverseArray(int arr[]) {
        
        int n = arr.length;
        int j = n - 1;

        for (int i = 0; i < n / 2; i++) {
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
    }
}
