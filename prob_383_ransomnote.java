/*
383. Ransom Note
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.

Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false

Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false

Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true

Constraints:
    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.

 */

public class prob_383_ransomnote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ram = toarray(ransomNote);
        char[] mag = toarray(magazine);

        for(int i = 0; i < mag.length; i++){
            for(int j = 0; j < ram.length; j++){
                if(mag[i] == ram[j]){
                    mag[i] = '\0';
                    ram[j] = '\0';
                }
            }
        }

        boolean flag = true;
        for(char i : ram){
            if(i != '\0') return false;
        }
        return true;
    }

    public char[] toarray(String str){
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
