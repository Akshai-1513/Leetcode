class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length() -1;
        while (true){
            if(s.charAt(last) != ' ')
                break;
            last--;
        }

        int count = 0;
        for(int i = last; i >= 0; i--){
            if (s.charAt(i) == ' ')
                break;
            count++;
        }  
        return count;
    }
}
