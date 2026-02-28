class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int i = 0, j = arr.length - 1;
        while(i <= j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        StringBuilder res = new StringBuilder();
        for(String k : arr){
            res.append(k);
            res.append(" ");
        }
        return new String(res).trim();
    }
}
