class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {

        int n = mat.length;
        int m = mat[0].length;
        int l = word.length();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                boolean found = false;

                if (mat[i][j] == word.charAt(0)) {

                    // Single character word
                    if (l == 1) {
                        found = true;
                    }

                    // Right
                    int k = 1;
                    int row = i;
                    int col = j;

                    while (k < l && col < m - 1) {
                        if (mat[row][col + 1] == word.charAt(k)) {
                            k++;
                            col++;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Left
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && col > 0) {
                        if (mat[row][col - 1] == word.charAt(k)) {
                            k++;
                            col--;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Down
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row < n - 1) {
                        if (mat[row + 1][col] == word.charAt(k)) {
                            k++;
                            row++;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Up
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row > 0) {
                        if (mat[row - 1][col] == word.charAt(k)) {
                            k++;
                            row--;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Down Right
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row < n - 1 && col < m - 1) {
                        if (mat[row + 1][col + 1] == word.charAt(k)) {
                            k++;
                            row++;
                            col++;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Down Left
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row < n - 1 && col > 0) {
                        if (mat[row + 1][col - 1] == word.charAt(k)) {
                            k++;
                            row++;
                            col--;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Up Right
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row > 0 && col < m - 1) {
                        if (mat[row - 1][col + 1] == word.charAt(k)) {
                            k++;
                            row--;
                            col++;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;

                    // Up Left
                    k = 1;
                    row = i;
                    col = j;

                    while (k < l && row > 0 && col > 0) {
                        if (mat[row - 1][col - 1] == word.charAt(k)) {
                            k++;
                            row--;
                            col--;
                        } else {
                            break;
                        }
                    }

                    if (k == l) found = true;
                }

                if (found) {
                    list.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }

        return list;
    }
}
