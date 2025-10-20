class Solution {
    public int hammingWeight(int n) {
        int temp = n, count = 0;
        while(temp > 0){
            if(temp % 2 == 1) count++;
            temp /= 2;
        }

        return count;
    }
}
