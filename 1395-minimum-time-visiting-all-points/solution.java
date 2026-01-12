class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int i = 0, j = 1, total = 0;
        while(j < points.length){
            int val1 = (int)Math.abs(points[i][0] - points[j][0]);
            int val2 = (int)Math.abs(points[i][1] - points[j][1]);
            i++;
            j++;
            total += (val1 > val2) ? val1 : val2;
        }
        return total;
    }
}
