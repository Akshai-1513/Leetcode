class Solution {
    public String generateTheString(int n) {
        char[] arr = new char[n];
        for(int i = 0; i < n; i++) arr[i] = 'a';
        if(n % 2 == 0) arr[n - 1] = 'k';
        return new String(arr);
    }
}
