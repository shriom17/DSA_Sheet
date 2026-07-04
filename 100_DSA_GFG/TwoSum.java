//Brute-force Solution
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return true;
                }
               
            }
        }
        return false;
    }
}
//Optimized 
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
       HashSet<Integer>set = new HashSet<>();
       int need=0;
       for(int i=0; i<arr.length; i++)
       {
           need = target - arr[i];
           if(set.contains(need))
           {
               return true;
           }
           else
           {
               set.add(arr[i]);
           }
       }
       return false;
    }
}
