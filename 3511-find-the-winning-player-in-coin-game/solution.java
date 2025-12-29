class Solution {
    public String winningPlayer(int x, int y) {
        int min = Math.min(x, y / 4);
        return (min % 2 == 1) ? "Alice" : "Bob";
    }
}
