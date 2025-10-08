class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++){
            int spell = spells[i];
            int left = 0, right = potions.length - 1, index = potions.length;
            while(left <= right){
                int mid = (left + right) / 2;
                long mul = (long) spell * potions[mid];
                if(mul >= success){
                    index = mid;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            spells[i] = potions.length - index;
        }
        return spells;
    }
}
