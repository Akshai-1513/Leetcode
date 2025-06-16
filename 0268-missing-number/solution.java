class Solution {
    public int missingNumber(int[] nums) {
       
        int sum_nums = 0;
        for(int i : nums){
            sum_nums += i;
        }
        int len = nums.length;
        int sum = len * (len + 1)/2;
        return Math.abs(sum - sum_nums);
    }
}
