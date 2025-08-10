class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i = x; i <= x + (k / 2) - 1; i++){
            int end = x + k - 1;
            for(int j = y; j < y + k; j++){
                int temp = grid[i][j];
                grid[i][j] = grid[end - (i - x)][j];
                grid[end - (i - x)][j] = temp;
            }
        }
        return grid;
    }
}
