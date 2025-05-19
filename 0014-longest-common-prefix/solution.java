class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
            return "";
        String prefix_res = strs[0];
        for(int i = 0;i < strs.length; i++){
            prefix_res = prefix(prefix_res , strs[i]);
            if (prefix_res == "")
                return "";
        }
        return prefix_res;
    } 
    static String prefix(String a, String b){
        int len_a = a.length();
        int len_b = b.length();
        int length = (len_a > len_b)? len_b : len_a;
        String result_prefix ="";
        for(int i =0;i<length;i++){
            if (a.charAt(i) == b.charAt(i))
                result_prefix += a.charAt(i);
            else
                break;
        }
        return result_prefix;
    }
}
