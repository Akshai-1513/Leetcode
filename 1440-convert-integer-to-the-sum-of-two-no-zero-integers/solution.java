class Solution {
    public int[] getNoZeroIntegers(int n) {
        int start = 1, end = n - 1;
        while(start < end){
            if(haszero(start) && haszero(end)) break;
            start++;
            end--;
        } 
        return new int[] {start, end};
    }
    public boolean haszero(int n){
        while(n > 0){
            int rem = n % 10;
            if(rem == 0) return false;
            n /= 10;
        }
        return true;
    }
}
