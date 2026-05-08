import java.util.*;

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        Map<Integer, Integer> cache = new HashMap<>();

        int left = 0, right = n - 1;

        // Find peak
        while (left < right) {
            int mid = left + (right - left) / 2;

            int midVal = get(mid, mountainArr, cache);
            int midNext = get(mid + 1, mountainArr, cache);

            if (midVal < midNext) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int peak = left;

        // Search ascending side
        left = 0;
        right = peak;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = get(mid, mountainArr, cache);

            if (val == target) return mid;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }

        // Search descending side
        left = peak + 1;
        right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = get(mid, mountainArr, cache);

            if (val == target) return mid;
            else if (val > target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    private int get(int index, MountainArray mountainArr, Map<Integer, Integer> cache) {
        if (!cache.containsKey(index)) {
            cache.put(index, mountainArr.get(index));
        }

        return cache.get(index);
    }
}
