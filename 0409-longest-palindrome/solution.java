class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()) freq[c]++;
    
        int len = 0;
        boolean flag = false;
        for(int i = 0; i < 128; i++){
            int val = freq[i];
            if(freq[i] % 2 == 0) len += val;
            else{
                len += (val - 1);
                flag = true;
            }
        }

        return flag ? len + 1 : len;
    }
}
