/*
976. Largest Perimeter Triangle
    Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

Example 1:
    Input: nums = [2,1,2]
    Output: 5
    Explanation: You can form a triangle with three side lengths: 1, 2, and 2.

Example 2:
    Input: nums = [1,2,1,10]
    Output: 0
    Explanation:
        You cannot use the side lengths 1, 1, and 2 to form a triangle.
        You cannot use the side lengths 1, 1, and 10 to form a triangle.
        You cannot use the side lengths 1, 2, and 10 to form a triangle.
        As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.

Constraints:
    3 <= nums.length <= 104
    1 <= nums[i] <= 106
 */

import java.util.*;
public class prob_976_largest_perimeter_triangle {
    public int largestPerimeter(int[] nums) {
        sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            if(nums[i] < nums[i - 1] + nums[i - 2]) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }

    private int[] sort(int nums[]){
        int max = 0;
        for(int i : nums) max = (i > max) ? i : max;

        int[] freq = new int[max + 1];
        for(int i : nums) freq[i]++;

        int index = 0;
        for(int i = 0; i <= max; i++) {
            while(freq[i] > 0) {
                nums[index++] = i;
                freq[i]--;
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
