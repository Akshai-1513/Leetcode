class Solution {
    public String reverseOnlyLetters(String s) {
        char[] letters = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j){
            char f = letters[i], l = letters[j];
            if((f >= 65 && f <= 90) || (f >= 97 && f<= 122)) {
                if ((l >= 65 && l <= 90) || (l >= 97 && l <= 122)) {
                    swap(letters, i , j);
                    i++;j--;
                }
                else j--;
            }
            else i++;
        }
        return new String(letters);
    }
    
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
