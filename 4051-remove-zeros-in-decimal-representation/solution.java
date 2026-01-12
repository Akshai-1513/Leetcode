class Solution {
    public long removeZeros(long n) {
        long mul = 1;
        long res = 0;
        while(n > 0){
            long rem = n % 10;
            if(rem != 0){
                res += (rem * mul);
                mul = mul * 10;
            }
            n /= 10;
        }
        return res;
    }
}
