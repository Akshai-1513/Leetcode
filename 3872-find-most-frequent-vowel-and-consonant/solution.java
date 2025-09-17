class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        int index = 0;
        for(char i : s.toCharArray()){
            freq[i - 'a']++;
        }
        System.out.println(Arrays.toString(freq));
        int max_v = 0, max_c = 0;
        for(int i = 0; i < freq.length; i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20)max_v = (max_v > freq[i])? max_v : freq[i];
            else max_c = (max_c < freq[i]) ? freq[i] : max_c;
        }
        return max_c + max_v;
    }
}
