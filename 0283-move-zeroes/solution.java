class Solution {
    public void moveZeroes(int[] nums) {
        int val = 0;
        int zero_c = 0;
        for(int i : nums){
            if(i == 0) zero_c++;
        }
        while(true){
            int index = nums.length - 1;
            for (int i = index - val; i >= 0; i--){
                if (nums[i] == 0){
                    index = i;
                    break;
                }
            }

            int i = index, j = index + 1;
            while(j < nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }

            val++;
            if(val == zero_c + 1) break;
        }
        System.out.println(Arrays.toString(nums));
    }
}
