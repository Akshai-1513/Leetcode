class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, j = n;
        int[] res = new int[2 * n];
        int index = 0;
        while(j < nums.length){
            res[index++] = nums[i++];
            res[index++] = nums[j++];
        }
        return res;
    }
}
