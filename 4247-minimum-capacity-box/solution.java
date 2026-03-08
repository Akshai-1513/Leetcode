class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minVal = 101, minindex = 0;
        boolean flag = false;
        for(int i = 0; i < capacity.length; i++) {
            int val = capacity[i];
            if(val == itemSize) return i;
            else if(val > itemSize) {
                if(minVal > val) {
                    minVal = val;
                    minindex = i;
                }
                flag = true;
            }
        }
          
          return flag ? minindex : -1;
    }
}
