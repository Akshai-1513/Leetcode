class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for(int i : nums){
            if(i % 2 == 0) index++;
        }
        while(index < nums.length){
            result[index] = 1;
            index++;
        }
        return result;
    }
}
