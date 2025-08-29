class Solution {
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
