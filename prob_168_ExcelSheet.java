/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

    Example 1:
    Input: columnNumber = 1
    Output: "A"

    Example 2:
    Input: columnNumber = 28
    Output: "AB"

    Example 3:
    Input: columnNumber = 701
    Output: "ZY"
 */

public class prob_168_ExcelSheet {
    public static String convertToTitle(int columnNumber) {
        if(columnNumber <= 26) return (char)(64 + columnNumber - 1) + "";
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

    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(convertToTitle(num));
    }

}
