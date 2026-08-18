class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        // First pass: right to left
        // Second pass: right to left again for circular behavior
        for(int i = 2 * n - 1; i >= 0; i--)
        {
            int index = i % n;
            
            while(!st.isEmpty() && st.peek() <= arr[index])
            {
                st.pop();
            }
            
            if(i < n)
            {
                if(st.isEmpty())
                {
                    list.add(-1);
                }
                else
                {
                    list.add(st.peek());
                }
            }
            
            st.push(arr[index]);
        }
        
        Collections.reverse(list);
        
        return list;
    }
}
