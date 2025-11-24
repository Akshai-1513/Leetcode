class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs){
            if(isNumber(s)) {
                int num = Integer.parseInt(s);
                max = (max < num) ? num : max;
            }
            else max = (max < s.length()) ? s.length() : max;
        }
        return max;
    }

    private boolean isNumber(String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9')continue;
            else return false;
        }
        return true;
    }
}
