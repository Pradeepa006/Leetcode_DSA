class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freqL = new int[26];
        int[] freqU = new int[26];
        int n = word.length();
        for(int i = 0 ; i < n ; i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                freqU[ch - 'A']++;
            }
            else
                freqL[ch - 'a']++;
        }
        int count = 0 ;
        for(int i = 0 ; i < 26 ; i++){
           if(freqL[i] > 0 && freqU[i] > 0 )
               count++;
        }
        return count;
    }
}