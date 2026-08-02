class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++)
        {
            String c=strs[i];
            char[] word=c.toCharArray();
            Arrays.sort(word);
            String s = new String(word);
            if(map.containsKey(s))
            {
                map.get(s).add(c);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(c);
                map.put(s,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
