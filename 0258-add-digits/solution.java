class Solution {
    public int addDigits(int num) {
        int temp = sum_val(num);
        while(temp > 9){
            temp = sum_val(temp);
        } 
        return temp;
    }
    private int sum_val(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
