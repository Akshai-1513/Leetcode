class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0 || (n % 3 != 0 && n > 2)) return false;
        int num = n; 
        int count = 0;
        while(num > 2) {
            num /= 3;
            System.out.println(num);
            count++;
        }
        num = (int) Math.pow(3, count);
        System.out.println(num);
        return n == num;
    }
}
