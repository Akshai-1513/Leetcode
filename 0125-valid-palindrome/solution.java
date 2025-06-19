class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str  = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                str.append(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            result.append(str.charAt(i));
        }
        System.out.println(result);
        System.out.println(str);
        return str.toString().equals(result.toString());
    }
}

