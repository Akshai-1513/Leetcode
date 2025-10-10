class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        for(String i : s.split(" ")){
            StringBuilder rev = new StringBuilder();
            for(char c : i.toCharArray()) rev.insert(0, c);
            reversed.append(rev + " ");
        }
        return reversed.toString().trim();
    }
}
