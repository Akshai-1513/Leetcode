class Solution {
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
