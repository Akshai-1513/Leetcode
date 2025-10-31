class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int num1 = 0, num2 = 0;
        int[] arr = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if (temp == nums[j]) {
                    arr[index] = temp;
                    index++;
                }
            }
        }
        num1 = arr[0]; num2 = arr[1];
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        return new int[]{num1, num2};
    }
}
