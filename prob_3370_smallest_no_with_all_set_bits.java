/*
3370. Smallest Number With All Set Bits
    You are given a positive number n.
    Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits

Example 1:
    Input: n = 5
    Output: 7
    Explanation:
        The binary representation of 7 is "111".

Example 2:
    Input: n = 10
    Output: 15
    Explanation:
        The binary representation of 15 is "1111".

Example 3:
    Input: n = 3
    Output: 3
    Explanation:
        The binary representation of 3 is "11".

Constraints:
    1 <= n <= 1000

 */

public class prob_3370_smallest_no_with_all_set_bits {
    public int smallestNumber(int n) {
        int count = 0,  temp = n;
        while(temp > 0){
            temp /= 2;
            count++;
        }

        int mul = 1, res = 0;
        while(count > 0){
            res += mul;
            mul *= 2;
            count--;
        }
        return res;
    }

}
