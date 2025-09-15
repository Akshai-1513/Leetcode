class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for(int i = 1; i < timeSeries.length; i++){
            int dif = timeSeries[i] - timeSeries[i - 1];
            if(dif < duration) res += dif;
            else res += duration;
        }
        return res + duration;
    }
}
