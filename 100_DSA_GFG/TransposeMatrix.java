class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n = mat.length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(left<=right)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=top; i<=bottom; i++)
            {
                temp.add(mat[i][left]);
            }
            ans.add(temp);
            left++;
        }
        
        return ans;
    }
}
