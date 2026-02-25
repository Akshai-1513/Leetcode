class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[] bits = new int[len];
        for(int i = 0; i < len; i++) bits[i] = Integer.bitCount(arr[i]);

        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(bits[i] < bits[j]) swap(arr, bits, i, j);
                else if(bits[i] == bits[j] && arr[i] < arr[j]) swap(arr, bits, i, j); 
            }
        }
        return arr;
    }

    void swap(int[] arr, int[] bits, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        temp = bits[i];
        bits[i] = bits[j];
        bits[j] = temp;
    }
}
