class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int i = arr.length - 1;
        while(i > 0){
            if(arr[i].equals(" ")) i--;
            else break;
        }

        return arr[i].length();
    }
}
