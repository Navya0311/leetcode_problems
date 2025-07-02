import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(0, res, ans, n);
        return ans;
    }

    public static void helper(int row, List<Integer> res, List<List<String>> ans, int n) {
        if (row == n) {
            ans.add(buildBoard(res, n)); 
            return;
        }
        for (int col = 0; col < n; col++) {
            if (insert(res, row, col, n)) {
                res.add(col);
                helper(row + 1, res, ans, n);
                res.remove(res.size() - 1); 
            }
        }
    }

    public static boolean insert(List<Integer> res, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            int prevCol = res.get(i);
            if (prevCol == col || Math.abs(i - row) == Math.abs(prevCol - col)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> buildBoard(List<Integer> res, int n) {
        List<String> board = new ArrayList<>();
        for (int col : res) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[col] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
