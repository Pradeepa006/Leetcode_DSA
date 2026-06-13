class Solution {
    public static char findCh(String word, int[] weights) {
        int weight = 0;

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i) - 'a';
            weight += weights[num];
        }

        weight %= 26;
        return (char) ('z' - weight);
    }

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            res.append(findCh(word, weights));
        }

        return res.toString();
    }
}