class Solution {
    public int maxProduct(int[] nums) {
        int max1 = max(nums), max2 = max(nums);
        return (max1 - 1) * (max2 - 1);
    }
    public int max(int[] nums){
        int max = nums[0], index = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        nums[index] = 0;
        return max;
    }
}
