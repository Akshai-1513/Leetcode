class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int index = 0;

        for(int i = 0; i < len; i++){
            int val = nums[i];
            boolean flag = val > 0;
            val = Math.abs(val);

            if(val == 0) {
                res[index++] = val;
                continue;
            }
            int j = i;
            while(val > 0){
                if(flag) {
                    j++;
                    if(j >= len) j = 0;
                }
                else {
                    j--;
                    if(j < 0) j = len - 1;
                }
                val--;
            }
            res[index++] = nums[j];
        }   
        return res;
    }
}
