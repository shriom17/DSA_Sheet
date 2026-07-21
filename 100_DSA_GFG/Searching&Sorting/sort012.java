class Solution {
    public void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
}
//Optimized
class Solution {
    public void sort012(int[] arr) {
        // code here
        //Arrays.sort(arr);
        int n=arr.length;
        int left=0;
        int right=n-1;
        int mid=0;
        
        while(mid<=right)
        {
            if(arr[mid]==2)
            {
                int a=arr[mid];
                arr[mid]=arr[right];
                arr[right]=a;
                right--;
            }
            else if(arr[mid]==0)
            {
                int a=arr[mid];
                arr[mid]=arr[left];
                arr[left]=a;
                left++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
        
    }
}
