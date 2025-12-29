class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;

        char[][] rail = new char[numRows][s.length()];
        boolean flag = false;
        int row  = 0, col = 0;

        for(char c : s.toCharArray()){
            rail[row][col++] = c;
            if(row == 0) flag = true;
            else if(row  == numRows - 1) flag = false;
            row += flag ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < s.length(); j++){
                if(rail[i][j] != '\u0000') result.append(rail[i][j]);
            }
        }

        return result.toString();
    }
}
