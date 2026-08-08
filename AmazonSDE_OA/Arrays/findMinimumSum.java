public static long findMinimumSum(List<Integer> power) {
    long ans = 0;

    for (int i = 1; i < power.size(); i++) {
        if (power.get(i) < power.get(i - 1)) {
            ans += (long)(power.get(i - 1) - power.get(i));
        }
    }

    return ans;
}
