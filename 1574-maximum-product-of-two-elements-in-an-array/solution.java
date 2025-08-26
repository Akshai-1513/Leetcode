class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0 ; j < nums.length;j++){
                int prod = 1;
                if(i == j) continue;
                prod = (nums[i] - 1) * (nums[j] - 1);
                maxprod = (prod > maxprod)? prod : maxprod;
            }
        }
        return maxprod;
    }
}
