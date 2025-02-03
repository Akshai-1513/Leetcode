public class Solution {
    public int reverse(int x) {
        long rev = 0;
        int num = x;
        if (num < 0)
            num = num * (-1);
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;
        if (x < 0)
            rev = rev * (-1);
        return (int) rev;

    }
}

