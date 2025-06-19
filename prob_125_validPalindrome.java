/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class prob_125_validPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0 , right = s.length()-1 ; //left at beginning and right at end

        while(left<right){
            char a  = s.charAt(left);
            char b = s.charAt(right);

            if(a>= 'A' && a <= 'Z') a= (char)(a + 32);
            if(b>= 'A' && b <= 'Z') b= (char)(b + 32);

            if(!((a >= 'a' && a <= 'z') || (a>= '0' && a <= '9'))){
                left++;
                continue;
            }
            if(!((b >= 'a' && b<= 'z') || (b>='0' && b <='9'))){
                right--;
                continue;
            }
            if(a!=b) return false ;

            left++;
            right--;
        }
        return true ;
    }

}

/* BRUTE FORCE:

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
 */
