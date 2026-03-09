class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Arrays.sort(nums);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int x = nums[0];
        int freq = map.get(x);
        System.out.println(freq);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int y = entry.getKey();
            if(x < y && freq != entry.getValue()){
                return new int[]{x, y};
            }
        }
        return new int[]{-1, -1};
    }
}
