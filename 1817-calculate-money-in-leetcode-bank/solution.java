class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int num = 1, count = 0;
        while(n > 0){
            sum += num + count;
            if(count == 6) {
                count = 0;
                num++;
                n--;
                continue;
            }
            count++;
            n--;
        }
        return sum;
    }
}
