class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[len + 1];
        for(int i : nums) freq[i]++;
        for(int i = 1; i <= len; i++) if(freq[i] == 0) list.add(i);
        return list;
    }
}
