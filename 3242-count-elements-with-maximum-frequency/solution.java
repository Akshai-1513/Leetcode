class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        int max = 0;
        for(int i : arr) max = (max < i) ? i : max;
        int tot = 0;
        for(int i : arr) if(i == max) tot += i;
        return tot;
    }
}
