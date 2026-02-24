class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(max < val) {
                max = val;
                index = i;
            }
        }
        return index;
    }
}
