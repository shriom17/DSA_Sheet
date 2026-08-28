/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public boolean areMirror(Node a, Node b) {
        // code here
        return mirror(a,b);
    }
    
    private boolean mirror(Node one, Node two)
    {
        if(one==null && two==null)
        {
            return true;
        }
        
        if(one==null || two==null)
        {
            return false;
        }
        
        if(one.data!=two.data)
        {
            return false;
        }
       
        return mirror(one.left, two.right)
        && mirror(one.right, two.left);
    }
}
