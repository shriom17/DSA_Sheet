class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
       // Stack<Integer>st= new Stack<>();
        int n=s.size();
        for(int i=1; i<=n; i++)
        {
            if(i==(n+1)/2)
            {
                s.removeElementAt(i - 1);
                break;
            }
        }
    }
}
