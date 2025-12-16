class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        Stack<Character> stack = new Stack<Character>();
		int i = 0, j = 0;
		while(j < s.length()) {
			char ch = s.charAt(j);
			if(!stack.contains(ch)) {
				stack.push(ch);
				j++;
				max_len = (max_len > stack.size()) ? max_len : stack.size();
			}
			else {
				stack.removeFirst();
				i++;
			}
			
		}
		
		return max_len;
    }
}
