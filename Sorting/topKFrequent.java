class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        int n = words.length;
        for(String i : words)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> 
        {
            if(map.get(a).equals(map.get(b)))
            {
                return a.compareTo(b);
            }
            else
            {
                return map.get(b) - map.get(a);
            }
        });
        return list.subList(0, k);
    }
}
