class Solution {
    public static String mask_email(String s) {
        String[] words = s.split("@");
        words[0] = words[0].toLowerCase();
        words[1] = words[1].toLowerCase();
        StringBuilder mask = new StringBuilder();
        int n1 = words[0].length();
        mask.append(words[0].charAt(0));
        mask.append("*****");
        mask.append(words[0].charAt(n1 - 1));
        mask.append("@");
        mask.append(words[1]);
        return mask.toString();
    }
    public static String mask_phone(String s) {
        StringBuilder mask = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
                mask.append(s.charAt(i));
        }
        String str = mask.toString();
        int digit = str.length();
        int country = digit - 10;
        int total = digit ;
        StringBuilder res = new StringBuilder();
        if (country > 0) {
        res.append("+");
        for (int i = 0; i < country; i++) {
            res.append("*");
        }
        res.append("-");
        }
        res.append("***-***-");
        res.append(str.substring(digit - 4));
        return res.toString();
    }
    public String maskPII(String s) {
        if(s.contains("@"))
             return mask_email(s);
        return mask_phone(s);
        
    }
}