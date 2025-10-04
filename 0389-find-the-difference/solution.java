class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        
        char res = '\0';
        for(Map.Entry<Character, Integer> i : map.entrySet()){
            if(i.getValue() % 2 != 0){
                res = i.getKey();
                break;
            }
        }
        return res;
    }
}
