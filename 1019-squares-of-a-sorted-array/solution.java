class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        return sort(nums);
    }
    public int[] sort(int[] nums){
        
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int index = i;
            for(int j = i ; j < nums.length; j++){
                if ( min > nums[j]){
                    min = nums[j];
                    index = j;
                }
            }
            swap(nums , i , index);
        }
        return nums;
    }
    public void swap (int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
