class Solution {
    public int passwordStrength(String password) {
        int n = password.length();
        HashSet<Character> hs = new HashSet<>();
        int points = 0 ;
        for(int i = 0 ; i < n ; i++) {
            char val = password.charAt(i);
            if(hs.contains(val))
                continue;
            hs.add(val);
            if(val >= '0' && val <= '9' ) {
                points += 3;
            }
            else if(val >= 'a' && val <= 'z') {
                points += 1;
            }
            else if(val >= 'A' && val <= 'Z') {
                points += 2;
            }
            else 
                points += 5;
        }
        return points;
    }
}