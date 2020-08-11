package leetcodecn;

import java.util.Arrays;

/**
 * 给定一个二维的矩阵，包含'X'和'O'（字母 O）。
 *
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的'O' 用 'X' 填充。
 *
 * 示例:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 解释:
 *
 * 被围绕的区间不会存在于边界上，换句话说，任何边界上的'O'都不会被填充为'X'。
 * 任何不在边界上，或不与边界上的'O'相连的'O'最终都会被填充为'X'。
 * 如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surrounded-regions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution130 {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        new Solution130().solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    public void solve(char[][] board) {
        if (board == null || board.length < 1) {
            return;
        }
        for (int i = 0, j = board.length - 1, k = 0; i < board[0].length; i++) {
            if (board[k][i] == 'O') {
                board[k][i] = '-';
                solve(k + 1, i, board);
            }
            if (board[j][i] == 'O') {
                board[j][i] = '-';
                solve(j - 1, i, board);
            }
        }
        for (int i = 0, j = board[0].length - 1, k = 0; i < board.length; i++) {
            if (board[i][k] == 'O') {
                board[i][k] = '-';
                solve(i, k + 1, board);
            }
            if (board[i][j] == 'O') {
                board[i][j] = '-';
                solve(i, j - 1, board);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void solve(int x, int y, char[][] board) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return;
        }
        if (board[x][y] == 'O') {
            board[x][y] = '-';
            solve(x - 1, y, board);
            solve(x + 1, y, board);
            solve(x, y - 1, board);
            solve(x, y + 1, board);
        }
    }
}
