class Solution {
    public int binaryGap(int n) {
        char []arr = (Integer.toBinaryString(n)).toCharArray();
        int max = 0;
        int start = 0, end = 1;

        while(end < arr.length){
            if(arr[end] == '1') {
                int dif = end - start;
                start = end;
                max = (max > dif) ? max : dif;
            }
            end++;
        }
        return max;
    }
}
