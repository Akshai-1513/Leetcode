class Solution {
    public boolean checkIfExist(int[] arr) {
        int i = 0, j = 0;
        while(i < arr.length){
            if(i != j && arr[i] == arr[j] * 2) return true;
            j++;
            if(j == arr.length){
                i++;
                j = 0;
            } 
        }
        return false;
    }
}
