class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder str = new StringBuilder();
        while(n > 0){
            str.append(n % 2);
            n /= 2;
        }

        char val = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);
            if(val == ch) return false;
            val = ch;
        }

        return true;
    }
}
