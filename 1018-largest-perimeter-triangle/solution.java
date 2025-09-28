class Solution {
    public int largestPerimeter(int[] nums) {
        sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            if(nums[i] < nums[i - 1] + nums[i - 2]) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }

    private int[] sort(int nums[]){
        int max = 0;
        for(int i : nums) max = (i > max) ? i : max;

        int[] freq = new int[max + 1];
        for(int i : nums) freq[i]++;

        int index = 0;
        for(int i = 0; i <= max; i++) {
            while(freq[i] > 0) {
                nums[index++] = i;
                freq[i]--;
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
