class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder res = new StringBuilder(s);
        String vowels = "aeiou";
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) res.deleteCharAt(i);
            else break;
        }
        return res.toString();
    }
}
