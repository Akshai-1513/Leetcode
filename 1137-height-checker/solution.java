class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] expected = new int[len];
        for(int i = 0; i < len; i++) expected[i] = heights[i];
        count_sort(expected, len);

        int count = 0;
        for(int i = 0; i < len ; i++) if(heights[i] != expected[i]) count++;
        return count;
    }

    public void count_sort(int nums[], int len){
        int max = nums[0];
        for(int i : nums) max = (max > i)? max : i;

        int[] freq = new int[max + 1];
        for(int i : nums) freq[i]++;

        int index = 0;
        for(int i = 0; i <= max; i++){
            while(freq[i] > 0){
                nums[index] = i;
                index++;
                freq[i]--;
            }
        }
    }
}
