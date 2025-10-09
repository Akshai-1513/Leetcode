class Solution {
    public boolean checkRecord(String s) {
        int count_a = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(ch == 'A') count_a++;
            if(ch == 'L' && i + 2 < arr.length) {
                if(arr[i + 1] == 'L' && arr[i + 2] == 'L') return false;
            } 
        }
        System.out.println(count_a);
        return count_a < 2;
    }
}
