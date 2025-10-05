class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int i = 0, j = arr.length - 1;
        while(i < j){
            if(vowels.contains(arr[i] + "") && vowels.contains(arr[j] + "")) {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }            
            else if(vowels.contains(arr[i] + "") && !vowels.contains(arr[j] + "")) j--;
            else if(vowels.contains(arr[j] + "") && !vowels.contains(arr[i] + "")) i++;
            else {
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
