class Solution {
    public int findFinalValue(int[] nums, int original) {

        int res = original;
        while(isContains(nums, res)) res *= 2;
        return res;
    }

    private boolean isContains(int[] nums, int target){
        for(int i : nums) if(i == target) return true;
        return false;
    }
}
