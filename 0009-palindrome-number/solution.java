class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev ="";
        for (int i = 0; i < str.length();i++){
            rev = str.charAt(i) + rev; 
        }
        if (str.equals(rev))
            return true;
        else
            return false;
            
    }
}
