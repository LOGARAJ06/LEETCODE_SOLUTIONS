class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hs = new HashSet<>();
        for(var i : candyType ){
            hs.add(i);
        }
        int n = candyType.length/2;
        if(hs.size()>=n)
            return n;
        else
            return hs.size();
    }
}