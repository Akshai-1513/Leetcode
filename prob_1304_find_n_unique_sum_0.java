/*
1304. Find N Unique Integers Sum up to Zero
    Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
    Input: n = 3
    Output: [-1,0,1]

Example 3:
    Input: n = 1
    Output: [0]

Constraints:
    1 <= n <= 1000
 */
public class prob_1304_find_n_unique_sum_0 {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int div = -(n / 2);
        if(n % 2 != 0) for(int i = 0; i < n; i++) nums[i] = div++;
        else{
            for(int i = 0; i < n; i++) {
                if(div == 0){
                    div++;
                    i--;
                    continue;
                }
                nums[i] = div++;
            }
        }
        return nums;
    }
}
