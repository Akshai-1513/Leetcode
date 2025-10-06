class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        for(int i = 0; i <= n; i++) nums[i] = bitsum(i);
        return nums;
    }
    public int bitsum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 2);
            n /= 2;
        }
        return sum;
    }
}
