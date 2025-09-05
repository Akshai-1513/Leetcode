/*
1051. Height Checker
    A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
    Return the number of indices where heights[i] != expected[i].

Example 1:
    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation:
    heights:  [1,1,4,2,1,3]
    expected: [1,1,1,2,3,4]
    Indices 2, 4, and 5 do not match.

Example 2:
    Input: heights = [5,1,2,3,4]
    Output: 5
    Explanation:
    heights:  [5,1,2,3,4]
    expected: [1,2,3,4,5]
    All indices do not match.

Example 3:
    Input: heights = [1,2,3,4,5]
    Output: 0
    Explanation:
    heights:  [1,2,3,4,5]
    expected: [1,2,3,4,5]
    All indices match.

Constraints:
    1 <= heights.length <= 100
    1 <= heights[i] <= 100
 */

public class prob_1051_Height_Checker {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] expected = new int[len];
        for(int i = 0; i < len; i++) expected[i] = heights[i];
        count_sort(expected, len);

        int count = 0;
        for(int i = 0; i < len ; i++) if(heights[i] != expected[i]) count++;
        return count;
    }

    public void count_sort(int nums[], int len){
        int max = nums[0];
        for(int i : nums) max = (max > i)? max : i;

        int[] freq = new int[max + 1];
        for(int i : nums) freq[i]++;

        int index = 0;
        for(int i = 0; i <= max; i++){
            while(freq[i] > 0){
                nums[index] = i;
                index++;
                freq[i]--;
            }
        }
    }
}
