class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += encrypt(i);
        }
        return sum;
    }
    public int encrypt(int n){
        int max = 0;
        int len = 0;
        while (n > 0){
            int rem = n % 10;
            max = (max > rem) ? max : rem;
            n /= 10;
            len++;
        }

        while(len > 0){
            n = (n * 10) + max;
            len --;
        }
        return n;
    }
}
