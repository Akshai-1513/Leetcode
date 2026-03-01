class Solution {
    public int xorOperation(int n, int start) {
        int val = 0;
        int count = 0;
        for(int i = start; count < n; i += 2, count++) val ^= i;
        return val;
    }
}
