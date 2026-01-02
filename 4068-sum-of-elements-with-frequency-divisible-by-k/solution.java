class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int total = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % k == 0) total += (entry.getKey() * entry.getValue());
        }
        return total;
    }
}
