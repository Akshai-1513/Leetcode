class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(entry.getKey() == val)  max = (max > val) ? max : val; 
        }

        return max;
    }
}
