class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int left = left_sum(nums, i);
            int right = right_sum(nums, i);
            if(left == right) return i;
        }
        return -1;
    }

    private int left_sum(int[] nums, int pivot){
        if(pivot == 0) return 0;
        int sum = 0;
        for(int i = pivot - 1; i >= 0; i--) sum += nums[i];
        return sum;
    }

    private int right_sum(int[] nums, int pivot){
        if(pivot == nums.length - 1) return 0;
        int sum = 0;
        for(int i = pivot + 1; i < nums.length; i++) sum += nums[i];
        return sum;
    }
}
