class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 4) return false;

        int p = -1;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] >= nums[i + 1]) {
                p = i;
                break;
            }
        }
        if(p <= 0) return false;

        int q = -1;
        for(int i = p; i < n - 1; i++){
            if(nums[i] <= nums[i + 1]){
                q = i;
                break;
            }
        }
        if (q <= p || q >= n - 1) return false; 

        for(int i = q; i < n - 1; i++){
            if(nums[i] >= nums[i + 1]) return false;
        }

        return true;
    }
}
