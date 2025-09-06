/*
1323. Maximum 69 Number
    You are given a positive integer num consisting only of digits 6 and 9.
    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:
    Input: num = 9669
    Output: 9969
    Explanation:
    Changing the first digit results in 6669.
    Changing the second digit results in 9969.
    Changing the third digit results in 9699.
    Changing the fourth digit results in 9666.
    The maximum number is 9969.

Example 2:
    Input: num = 9996
    Output: 9999
    Explanation: Changing the last digit 6 to 9 results in the maximum number.

Example 3:
    Input: num = 9999
    Output: 9999
    Explanation: It is better not to apply any change.

Constraints:
    1 <= num <= 104
    num consists of only 6 and 9 digits.
 */
public class prob_1323_maximum_69 {
    public int maximum69Number (int num) {
        int n = num;
        int div = 1;
        while (num / div >= 10) {
            div *= 10;
        }
        int res = 0, max = 1;
        while (div > 0) {
            int digit = num / div;
            if(digit == 6 && max == 1) {
                digit = 9;
                max--;
            }
            res = (res * 10) + digit;
            num %= div;
            div /= 10;
        }
        return res;
    }
}
