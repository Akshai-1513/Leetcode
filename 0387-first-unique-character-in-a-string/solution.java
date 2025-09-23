class Solution {
    public int firstUniqChar(String s) {
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            for(int j = 0; j < s.length(); j++){
                if(i != j && ch == s.charAt(j)) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if(flag) return i;
        }
        return -1;
    }
}
