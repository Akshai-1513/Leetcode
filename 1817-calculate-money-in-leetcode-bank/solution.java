class Solution {
    public int totalMoney(int n) {
        int count = 0, iter = 1, totalSum = 0;
        while(n > 0){
            int val = count + iter;
            totalSum += val;
            count++;
            n--;
            if(count == 7){
                count = 0;
                iter++;
            }
        }
        return totalSum;
    }
}
