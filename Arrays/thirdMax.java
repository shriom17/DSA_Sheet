class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
       if(list.size()>=3)
       {
            return list.get(2);
       }
       return list.get(0);
    }
}
