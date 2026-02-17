class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len = nums.size();
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            boolean flag = false;
            int val = nums.get(i);
            int j;
            for(j = 0; j < val; j++){
                if((j | (j + 1)) == val){
                    flag = true;
                    break;
                }
            }
            res[i] = !flag ? -1 : j;
        } 
        return res;
    }
}
