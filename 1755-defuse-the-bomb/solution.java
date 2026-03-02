class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k == 0) return res;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                int j = i + 1;
                for (int cnt = 0; cnt < k; cnt++) {
                    sum += code[j % n];
                    j++;
                }
            } else {
                int j = i - 1;
                for (int cnt = 0; cnt < -k; cnt++) {
                    if (j < 0) j += n;
                    sum += code[j];
                    j--;
                }
            }
            res[i] = sum;
        }
        return res;
    }
}
