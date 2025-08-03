class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int res = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double num1 = dimensions[i][0];
            double num2 = dimensions[i][1];
            double cur_max = Math.sqrt((num1 * num1) + (num2 * num2));
            int area = dimensions[i][0] * dimensions[i][1];

            if (cur_max > max) {
                max = cur_max;
                res = area;
            } else if (cur_max == max && area > res) {
                res = area;
            }
        }
        return res;
    }
}
