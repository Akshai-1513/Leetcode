class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int i = 0, j = k;
        while(j <= s.length()){
            String sub = s.substring(i, j);
            set.add(sub);
            i++;
            j++;
        }
        int val = (int) Math.pow(2, k);
        return set.size() == val;
    }
}
