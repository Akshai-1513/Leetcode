class Solution {
    public String toGoatLatin(String sentence) {
        int count = 1, index = 0;
        List<StringBuilder> words = new ArrayList<>();
        for(String s : sentence.split(" ")){
            StringBuilder str = new StringBuilder();
            char ch = s.charAt(0);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'|| ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'|| ch == 'U'){
                str.append(s);
                str.append("ma");
            }
            else {
                str.append(s.substring(1, s.length()));
                str.append(s.charAt(0));
                str.append("ma");
            }
            for(int i = 0; i < count; i++){
                str.append("a");
            }
            count++;
            words.add(str);
        }
        return String.join(" ", words);
    }
}
