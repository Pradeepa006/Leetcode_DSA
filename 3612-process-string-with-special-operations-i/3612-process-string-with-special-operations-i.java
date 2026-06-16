class Solution {
    public static void reverse (StringBuilder sb) {
        // int n = sb.length();
        // int i = 0 ; 
        // int j = n - 1 ;
        // while(i < j) {
        //     char temp = sb.chsrAt(i);

        // }
        sb.reverse();
    }
    public static void duplicate (StringBuilder sb) {
        sb = sb.append(sb);
    }
    public static void removeLast(StringBuilder sb) {
        int n = sb.length();
        sb.deleteCharAt(n - 1);
    }
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                res.append(ch);
                continue;            
            }
            if(res.length() >= 1) {
            if(ch == '#')
                duplicate(res);
            else if (ch == '%')
                reverse(res);
            else
                removeLast(res);
            }
        }
        return res.toString();
    }
}