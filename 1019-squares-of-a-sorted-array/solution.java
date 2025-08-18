class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    int[] sort(int nums[]){
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int index = i;
            for(int j = i; j < nums.length; j++){
                if(nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            swap(nums, i , index);
        }
        return nums;
    }

    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
