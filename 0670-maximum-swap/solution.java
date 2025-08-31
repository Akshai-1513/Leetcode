class Solution {
    public int maximumSwap(int num) {
        int n = num;
        int len = (num + "").length(), index = len - 1;
        int[] nums = new int[len];
        while (n > 0) {
            nums[index] = n % 10;
            index--;
            n /= 10;
        }

        for (int i = 0; i < len; i++) {
            int tot = tot(nums, i);
            if (tot > num) return tot;
        }
        return num;
    }

    public int tot(int[] nums, int i) {
        int tot = 0;
        int[] arr = Arrays.copyOf(nums, nums.length);
        int j = max_index(arr, i);
        swap(arr, i, j);
        for (int k : arr) tot = tot * 10 + k;
        return tot;
    }

    public int max_index(int[] nums, int j) {
        int max = nums[j];
        int index = j;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
