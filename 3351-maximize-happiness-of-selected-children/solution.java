class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long total = 0;
        int index = happiness.length - 1;
        Arrays.sort(happiness);

        int val = 0;
        while(k > 0){
            int cur = happiness[index] - val;
            if(cur <= 0) break;
            total += cur;
            index--;
            val++;
            k--;
        }
        return total;
    }
}
