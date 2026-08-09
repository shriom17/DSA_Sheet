/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {

        ArrayList<pair> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        // arr2 elements store
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        // Increasing order of first element
        Arrays.sort(arr1);

        for (int num : arr1) {

            int v = target - num;

            if (map.containsKey(v)) {

                int count = map.get(v);

                while (count > 0) {
                    ans.add(new pair(num, v));
                    count--;
                }
            }
        }

        return ans.toArray(new pair[0]);
    }
}
