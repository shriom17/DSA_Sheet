public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> st = new Stack<>();
        int n = A.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && st.peek() >= A[i])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = st.peek();
            }

            st.push(A[i]);
        }
        return result;
    }
}
