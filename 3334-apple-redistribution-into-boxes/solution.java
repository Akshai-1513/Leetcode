class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total_apples = 0;
        for(int i : apple) total_apples += i;

        sort(capacity);
        int count = 0;
        for(int i = capacity.length - 1; i >= 0; i--){
            if(total_apples <= 0) break;
            count++;
            total_apples -= capacity[i];
        }
        return count;
    }

    int[] sort(int[] nums){
        int[] freq = new int[51];
        for(int i : nums) freq[i]++;

        int index = 0;
        for(int i = 0; i < 51; i++) {
            while(freq[i] > 0){
                nums[index++] = i;
                freq[i]--;
            }
        }
        return nums;
    }
}
