class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";

        int temp = Math.abs(num);
        StringBuilder str = new StringBuilder();
        while(temp > 0){
            int rem = temp % 7;
            str.insert(0, rem + "");
            temp /= 7;
        }
        if(num < 0) str.insert(0, '-');
        return str.toString();
    }
}
