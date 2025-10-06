/*
338. Counting Bits
    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Example 1:
    Input: n = 2
    Output: [0,1,1]
    Explanation:
        0 --> 0
        1 --> 1
        2 --> 10

Example 2:
    Input: n = 5
    Output: [0,1,1,2,1,2]
    Explanation:
        0 --> 0
        1 --> 1
        2 --> 10
        3 --> 11
        4 --> 100
        5 --> 101

Constraints:
    0 <= n <= 105
 */

public class prob_338_Counting_bits {
    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        for(int i = 0; i <= n; i++) nums[i] = bitsum(i);
        return nums;
    }

    public int bitsum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 2);
            n /= 2;
        }
        return sum;
    }
}
