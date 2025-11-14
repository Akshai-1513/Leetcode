class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            int min = nums[0];
            int index = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = -1 * nums[index];
        }

        int sum = 0;
        for(int i : nums) sum += i;
        return sum;
    }
}
