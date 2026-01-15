class Solution {
    public int[] sortByReflection(int[] nums) {
        int[] rev = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            rev[i] = reverseNum(nums[i]);
        }
        System.out.println(Arrays.toString(rev));

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(rev[i] > rev[j] || rev[i] == rev[j] && nums[i] > nums[j]){
                    swap(rev, i, j);
                    swap(nums, i, j);
                }
            }
        }

        return nums;
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    int reverseNum(int n){
        int res = 0;
        int bits = Integer.toBinaryString(n).length();
        
        while(bits-- > 0){
            res <<= 1;
            if((n & 1) == 1) res |= 1;
            n >>= 1;
        }
        return res;
    }
}
