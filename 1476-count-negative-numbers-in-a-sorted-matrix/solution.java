class Solution {
    public int countNegatives(int[][] grid) {
        int i = grid.length - 1, j = 0;
        int len = grid[0].length;
        int total_neg = 0;
        while(i >= 0 && j < len){
            if(grid[i][j] < 0) {
                total_neg += (len - j);
                i--;
            }
            else j++;
        }      
        return total_neg;   
    }
}
