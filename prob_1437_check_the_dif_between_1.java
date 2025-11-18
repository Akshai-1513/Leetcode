/*
1437. Check If All 1's Are at Least Length K Places Away
    Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

Example 1:
    Input: nums = [1,0,0,0,1,0,0,1], k = 2
    Output: true
    Explanation: Each of the 1s are at least 2 places away from each other.

Example 2:
    Input: nums = [1,0,0,1,0,1], k = 2
    Output: false
    Explanation: The second 1 and third 1 are only one apart from each other.

Constraints:
    1 <= nums.length <= 105
    0 <= k <= nums.length
    nums[i] is 0 or 1
 */

public class prob_1437_check_the_dif_between_1 {
    public boolean kLengthApart(int[] nums, int k) {
        int j = index(nums);
        if(j == -1) return true;
        for(int i = 0; i < nums.length; i++){
            int dif = 0;
            if(nums[i] == 1 && i != j) {
                dif = i - j;
                j = i;
                if(dif <= k) return false;
            }
        }
        return true;
    }

    int index(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) return i;
        }
        return -1;
    }
}
