/*
Given two binary strings a and b, return their sum as a binary string.

    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"

 */

public class prob_67_Binary_addition {
    public String addBinary(String a, String b) {
        int sum = 0, carry = 0;
        StringBuilder res = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;

        while(i >= 0 || j >= 0 || carry != 0){
            int bit_a = (i >= 0)? a.charAt(i) - '0' : 0;
            int bit_b = (j >= 0)? b.charAt(j) - '0' : 0;

            sum = bit_a + bit_b + carry;
            res.append(sum % 2);
            carry = sum/2;

            i--;
            j--;
        }
        return res.reverse().toString();
    }
}


// Brute force.
/*
class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
	    int m = b.length();
	    if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = '0' + b;
            }
        } else if (b.length() > a.length()) {
            int diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = '0' + a;
            }
        }


	    int carry = 0, sum = 0;
	    String res = "";
	    for (int i = a.length() - 1; i>=0 ;i-- ){

	        int bit_a = a.charAt(i) - '0';
	        int bit_b = b.charAt(i) - '0';
	        sum = bit_a + bit_b + carry;
	        res = ((sum % 2) +"") + res;
	        carry = sum/2;
	    }
	    if(carry != 0) res = '1' + res;
	    return res;
    }
}
 */