class Solution {
    public int findClosest(int x, int y, int z) {
        int x_dist = Math.abs(z - x);
        int y_dist = Math.abs(z - y);
        if(x_dist < y_dist) return 1;
        if(x_dist > y_dist) return 2;
        return 0; 
    }
}
