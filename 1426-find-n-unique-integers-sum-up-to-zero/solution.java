class Solution {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int div = -(n / 2);
        if(n % 2 != 0) for(int i = 0; i < n; i++) nums[i] = div++;
        else{
            for(int i = 0; i < n; i++) {
                if(div == 0){
                    div++;
                    i--;
                    continue;
                }
                nums[i] = div++;
            }
        }
        return nums;
    }
}
