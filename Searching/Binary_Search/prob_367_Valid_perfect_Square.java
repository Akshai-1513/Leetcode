package Searching.Binary_Search;
/*
367. Valid Perfect Square
    Given a positive integer num, return true if num is a perfect square or false otherwise.
    A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
    You must not use any built-in library function, such as sqrt.

Example 1:
    Input: num = 16
    Output: true
    Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
    Input: num = 14
    Output: false
    Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

Constraints:
    1 <= num <= 231 - 1
 */

public class prob_367_Valid_perfect_Square {
    public boolean isPerfectSquare(int num) {
        int val = mySqrt(num);
        System.out.println(val);
        if((val * val) == num) return true;
        return false;
    }

    static int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int start = 0;
        int end = x / 2;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long square = (long)mid * mid;

            if(square == x) return mid;
            else if(square < x) {
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
}
