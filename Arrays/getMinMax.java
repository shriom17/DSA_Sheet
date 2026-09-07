class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code 
        int minn=arr[0];
        int maxx=arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<arr.length; i++)
        {
            minn = Math.min(minn, arr[i]);
            maxx = Math.max(maxx, arr[i]);
        }
        list.add(minn);
        list.add(maxx);
        return list;
    }
}
