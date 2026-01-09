class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String ans="";
        for(int i=n-1; i>=0; i--)
        {
            ans = ans+s.charAt(i);
        }
        char[] ch=ans.toCharArray();
        int start=0;
        int end;
        char temp;
        for(int i=0; i<n; i++)
        {
            if(ch[i]==' ')
            {
                end=i-1;
                while(start<end)
                {
                    temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
                }
                   start = i+1;
            }
        }
        end = n-1;
        while(start < end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
       }

        String res= new String(ch);
        res=res.trim();
        res = res.replaceAll("\\s+", " ");

        return res;
    }
}
