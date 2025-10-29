class Solution {
    public int smallestNumber(int n) {
        int count = 0,  temp = n;
        while(temp > 0){
            temp /= 2;
            count++;
        }

        int mul = 1, res = 0;
        while(count > 0){
            res += mul;
            mul *= 2;
            count--;
        }   
        return res;
    }
}
