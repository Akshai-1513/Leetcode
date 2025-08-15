class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') myStack.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(myStack.isEmpty()) return false;
                char top = myStack.pop();
                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) return false;
            }
        }

        return myStack.isEmpty();
    }
}
