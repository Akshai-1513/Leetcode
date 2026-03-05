class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        int appears = arr.length / 4;
        int maxVal = 0, maxKey = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val >= appears && val > maxVal) {
                maxVal = val;
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
