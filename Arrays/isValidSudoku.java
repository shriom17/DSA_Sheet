class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(board[i][j] != '.')
                {
                    if(!isValid(board, i, j))
                    {
                        return false;
                    }
                   
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int i, int j)
    {
        char num = board[i][j];
        for(int col=0; col<9; col++)
        {
            if(col!=j && board[i][col]==num)
            {
                return false;
            }
        }
        for(int row=0; row<9; row++)
        {
            if(row!=i && board[row][j]==num)
            {
                return false;
            }
        }
         int rowStart = (i / 3) * 3;
    int colStart = (j / 3) * 3;

    for (int r = rowStart; r < rowStart + 3; r++) {
        for (int c = colStart; c < colStart + 3; c++) {
            if ((r != i || c != j) && board[r][c] == num) {
                return false;
            }
        }
    }

    return true;
    }
}
