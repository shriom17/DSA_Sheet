class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n=arr.length;
       
        for(int i=0; i<n; i++)
        {
            list.add(-1);
        }
        
        for(int i=n-1; i>=0; i--)
        {
            while(!st.empty() && st.peek() <=arr[i])
            {
                st.pop();
            }
            
            if (!st.isEmpty()) {
                list.set(i, st.peek());
            }
            
            st.push(arr[i]);
        }
        
        return list;
    }
}
