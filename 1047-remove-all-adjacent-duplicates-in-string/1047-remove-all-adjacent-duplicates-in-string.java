class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i = 0 ; i < n ; i++) {
            if(stack.isEmpty()) {
                stack.push(ch[i]);
                continue;
            }
            else if (stack.peek() == ch[i]) {
                stack.pop();
            }
            else {
                stack.push(ch[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!(stack.isEmpty())) {
            res.append(stack.peek());
            stack.pop();
        }

        String r = res.reverse().toString();

        return r;
    }
}