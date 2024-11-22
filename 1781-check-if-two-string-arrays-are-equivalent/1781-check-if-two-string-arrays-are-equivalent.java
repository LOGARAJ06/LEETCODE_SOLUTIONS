class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder k = new StringBuilder();
        for (String w1 : word1) {
            s.append(w1);
        }
        for (String w2 : word2) {
            k.append(w2);
        }
        return s.toString().equals(k.toString());
    }
}