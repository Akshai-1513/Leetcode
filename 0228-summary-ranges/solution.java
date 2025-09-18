class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> list = new ArrayList<>();
        int start = 0, end = 0;
        while (end < nums.length){
            if(end + 1 < nums.length && nums[end + 1] == nums[end] + 1) end++;
            else {
                if(start == end) list.add(nums[start] + "" );
                else list.add(nums[start] + "->" + nums[end]);
                start = end + 1;
                end = end + 1;
            }
        }
        return list;
    }
}
