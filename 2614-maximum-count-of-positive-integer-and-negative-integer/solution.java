class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int i = 0, j = n - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(nums[mid] <= 0) i = mid + 1;
            else j = mid - 1;
        }
        int pos = n - i;

        i = 0; j = n - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(nums[mid] >= 0) j = mid - 1;
            else i = mid + 1;
        }
        int neg = i;
        return pos > neg ? pos : neg;
    }
}
