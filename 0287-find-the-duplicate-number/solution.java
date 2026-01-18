class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }

        int res = 0;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1) {
                res = nums[index];
                break;   
            }
        }
        return res;
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
