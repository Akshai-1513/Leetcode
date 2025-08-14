class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int n : nums) {
            int num = n;
            if (num == first || num == second || num == third) continue;

            if (first == Long.MIN_VALUE || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == Long.MIN_VALUE || num > second) {
                third = second;
                second = num;
            } else if (third == Long.MIN_VALUE || num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int)third;
    }
}
