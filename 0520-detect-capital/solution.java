class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() < 2) return true;
        char[] arr = word.toCharArray();
        if(arr[0] <= 90) {
            boolean flag = arr[1]  < 91;
            for(int i = 1; i < arr.length; i++){
                if((!flag && arr[i] < 91) || (flag && arr[i] > 90)) return false; 
            }
        }
        else{
            for(char i : arr){
                if(i < 97) return false;
            }
        }

        return true;
    }
}
