/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {

    // Helper function: count how many letters match in same position
    private int matchCount(String a, String b) {
        int count = 0;
        for(int i = 0; i < 6; i++) {
            if(a.charAt(i) == b.charAt(i)) count++;
        }
        return count;
    }

    public void findSecretWord(String[] words, Master master) {
        List<String> candidates = new ArrayList<>(Arrays.asList(words));
        Random rand = new Random(); // pick random word each time

        while(!candidates.isEmpty()) {
            // pick a random word from current candidates
            String guessWord = candidates.get(rand.nextInt(candidates.size()));
            int matches = master.guess(guessWord);

            if(matches == 6) return; // secret found

            // create new list with only words that have same matches
            List<String> nextCandidates = new ArrayList<>();
            for(String word : candidates) {
                if(matchCount(word, guessWord) == matches) {
                    nextCandidates.add(word);
                }
            }

            candidates = nextCandidates; // shrink candidate list
        }
    }
}
