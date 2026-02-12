class Solution {
    public String reversePrefix(String s, int k) {
        String subs = s.substring(0, k);

        char[] arr = subs.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i <= j){
            char  temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

        return new String(arr) + s.substring(k, s.length());
    }
}
