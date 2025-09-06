class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int div = 1;
        while (num / div >= 10) {
            div *= 10;
        }
        int res = 0, max = 1; 
        while (div > 0) {
            int digit = num / div;
            if(digit == 6 && max == 1) {
                digit = 9;
                max--;
            }
            res = (res * 10) + digit;
            num %= div;
            div /= 10;
        }
        return res;
    }
}
