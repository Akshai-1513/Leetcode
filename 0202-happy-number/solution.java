class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        seen.add(n);
        while(n != 1){
            int num = n;
            n = 0;
            while(num > 0){
                int rem = num % 10;
                n += (rem * rem);
                num /= 10;
            }
            if(seen.contains(n)) return false;
            seen.add(n);
        }
        return true;
    }
}
