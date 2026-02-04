class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morseWords[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder str = new StringBuilder();
            for(char ch : s.toCharArray()){
                int index = ch - 'a';
                str.append(morseWords[index]);
            }
            set.add(str.toString());
        }
        return set.size();
    }
}
