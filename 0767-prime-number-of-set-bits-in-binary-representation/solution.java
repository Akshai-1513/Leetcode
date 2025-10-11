class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int num = i;
            int n = 0;
            while (num > 0){
                int rem = num % 2;
                n += rem;
                num /= 2;
            }
            
            if(isPrime(n)) count++;
            
        }
        return count;
    }

    private boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0) return false;
           }
        return true;
    }
}
