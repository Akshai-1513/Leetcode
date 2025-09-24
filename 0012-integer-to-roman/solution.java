class Solution {
    public String intToRoman(int num) {
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] s = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder roman = new StringBuilder();

        for(int i = nums.length - 1; i >= 0 && num > 0; i--){
            while(num >= nums[i]){
                num -= nums[i];
                roman.append(s[i]);
            }
        }
        return roman.toString();
    }
}
