class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int[] c = new int[n+m];
        int j=0;
        
        for(int i=0; i<n; i++)
        {
            c[i]=a[i];
        }
        
        for(int i=n; i<n+m; i++)
        {
            c[i]=b[j];
            j++;
        }
        Arrays.sort(c);
       
        
        return c[k-1];
    }
}
