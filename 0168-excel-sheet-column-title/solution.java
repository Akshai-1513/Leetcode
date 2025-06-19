class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber <= 26) return (char)('A' + columnNumber - 1) + "";
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber = columnNumber - 1;
            char rem =(char)('A' + columnNumber % 26);
            result.append(rem);
            columnNumber /= 26;
        }
        result = result.reverse();
        return result.toString();
    }
}
