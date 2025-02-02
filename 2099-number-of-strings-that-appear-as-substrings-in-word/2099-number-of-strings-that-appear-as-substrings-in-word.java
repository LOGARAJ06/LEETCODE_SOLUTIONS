class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String name:patterns){
            if(word.contains(name)){
                count++;
            }
        }

        return count;
    }
}