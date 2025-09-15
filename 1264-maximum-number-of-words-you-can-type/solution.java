class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");

        Set<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) set.add(c);

        for (String i : words) {
            boolean flag =  true;
            for(char c : i.toCharArray()) {
                if(set.contains(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        return count;
    }
}
