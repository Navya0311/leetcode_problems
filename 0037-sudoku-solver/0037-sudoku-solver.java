class Solution {
    public void solveSudoku(char[][] board) {
        fillcell(board);
    }

    public static boolean fillcell(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isvalid(i, j, ch, board)) {
                            board[i][j] = ch;
                            if (fillcell(board)) return true;
                            board[i][j] = '.'; // backtrack
                        }
                    }
                    return false; // if no digit is valid
                }
            }
        }
        return true; // board is filled
    }

    public static boolean isvalid(int r, int c, char choice, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == choice || board[i][c] == choice) {
                return false;
            }
        }

        int rstart = (r / 3) * 3;
        int cstart = (c / 3) * 3;

        for (int i = rstart; i < rstart + 3; i++) {
            for (int j = cstart; j < cstart + 3; j++) {
                if (board[i][j] == choice) {
                    return false;
                }
            }
        }

        return true;
    }
}
