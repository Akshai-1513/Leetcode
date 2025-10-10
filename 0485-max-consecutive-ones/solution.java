class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max_sum = 0;
        for(int i : nums) {
            if(i == 1) sum++;
            max_sum = (sum > max_sum) ? sum : max_sum;
            if(i == 0) sum = 0;
        }
        return max_sum;
    }
}
