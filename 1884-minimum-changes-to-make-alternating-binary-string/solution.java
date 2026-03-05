class Solution {
    public int minOperations(String s) {
        int flip1 = 0, flip2 = 0;
        for(int i = 0; i < s.length(); i++){
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            flip1 += (s.charAt(i) == expected1) ? 1 : 0;
            flip2 += (s.charAt(i) == expected2) ? 1 : 0;
        }

        return Math.min(flip1, flip2);
    }
}
