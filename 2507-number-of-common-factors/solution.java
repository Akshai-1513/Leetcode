class Solution {
    public int commonFactors(int a, int b) {
        int div = (a < b) ? a : b;
        int count = 0;
        while(div > 0){
            if(a % div == 0 && b % div == 0) count++;
            div--;
        }
        return count;
    }
}
