class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        if(num == 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) {
                if(num / i == i) {
                    sum += i;
                    System.out.println(sum);
                }
                else {
                    sum += i + (num / i);
                    System.out.println(sum);
                }
            }
        }
        return num == sum;
    }
}
