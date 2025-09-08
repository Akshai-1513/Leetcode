class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int max = nums[0];
        for(int i : nums) max = (i > max) ? i : max;
        int[] freq = new int[max + 1];
        for(int i : nums){
            freq[i]++;
        }

        for(int i : freq) {
            if(isPrime(i)) return true;
        }
        return false;
    }
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;
        return true;
    }
}
