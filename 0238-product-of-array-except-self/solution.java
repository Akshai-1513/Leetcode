class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero_count = 0;
        int prod = 1;
        for(int i : nums){
            if(i == 0){
                zero_count++;
                continue;
            }
            prod *= i;
        }
        for(int i = 0; i < nums.length; i++){
            if(zero_count > 1) {
                nums[i] = 0;
            }
            else if(zero_count == 1){
                if(nums[i] == 0) nums[i] = prod;
                else nums[i] = 0;
            }
            else{
                nums[i] = prod/ nums[i];
            }
        }
        return nums;
    }
}
