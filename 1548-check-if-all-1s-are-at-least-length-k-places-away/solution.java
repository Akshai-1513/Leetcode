class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int j = index(nums);
        if(j == -1) return true;
        for(int i = 0; i < nums.length; i++){
            int dif = 0;
            if(nums[i] == 1 && i != j) {
                dif = i - j;
                j = i;
                if(dif <= k) return false;
            }
        }
        return true;
    }
    
    int index(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) return i;
        }
        return -1;
    }
}
