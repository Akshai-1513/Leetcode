class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int res = 0;
        int bits = 1;
        while(n > 0){
            int rem = n % 2;
            n >>= 1;
            res += rem == 0? bits : 0;
            bits *= 2;
        }
        return res;
    }
}
