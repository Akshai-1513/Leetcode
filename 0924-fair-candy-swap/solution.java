class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int i = 0;
        int j = 0;
        int res[] = new int[2];
        int sum_alice = sum(aliceSizes);
        int sum_bob = sum(bobSizes);
        while(i < aliceSizes.length){
            while(j < bobSizes.length){
                if(sum_alice - aliceSizes[i] + bobSizes[j] == sum_bob - bobSizes[j] + aliceSizes[i]){
                    res[0] = aliceSizes[i];
                    res[1] = bobSizes[j];
                    return res;
                }
                j++;
            }
            i++;
            j = 0;
        }
        return res;
    }

    void swap(int alice[], int[] bob, int i, int j){
        int temp = alice[i];
        alice[i] = bob[j];
        bob[j] = temp;
    }
    
    int sum(int[] nums){
        int sum = 0;
        for(int i : nums) sum += i;
        return sum;
    }
}
