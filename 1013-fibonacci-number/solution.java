class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int i = 0, j = 1;
        int sum = 0;
        for(int k = 2; k <= n; k++){
            sum = i + j;
            int temp = i;
            i = j;
            j = sum;
        } 
        return sum;
    }
}
