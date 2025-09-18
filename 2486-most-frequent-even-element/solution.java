class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        for (int i = 0; i < nums.length; i++) arr[nums[i]]++;

        int max = -1, index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0 && arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return (max == 0)? -1 : index;
    }
}
