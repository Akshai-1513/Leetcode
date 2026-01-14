class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            int sum = 0;
            int count = 0;
            for (int d = 1; d * d <= num; d++) {
                if (num % d == 0) {
                    int other = num / d;

                    sum += d;
                    count++;

                    if (other != d) {
                        sum += other;
                        count++;
                    }

                    if (count > 4) break;
                }
            }
            if(count == 4) totalSum += sum;
        }
        return totalSum;
    }
}
