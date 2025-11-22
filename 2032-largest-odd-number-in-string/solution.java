class Solution {
    public String largestOddNumber(String num) {
        int start = 0;
        for(int i = num.length() - 1; i >= 0; i--){
            int val = num.charAt(i) - '0';
            if(val % 2 != 0) return num.substring(start, i + 1);
        }
        return "";
    }
}
