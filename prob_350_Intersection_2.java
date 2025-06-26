/*
350. Intersection of Two Arrays II
    Given two integer arrays nums1 and nums2, return an array of their intersection.
    Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.
    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]

    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]
    Explanation: [9,4] is also accepted.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class prob_350_Intersection_2 {
    static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums2[j]);
                    nums1[i] = -1;
                    nums2[j] = -1;
                    break;
                }
            }
        }

        int []arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
