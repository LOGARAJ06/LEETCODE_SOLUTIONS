class Solution {
    public int longestPalindrome(String str) {
        long bit=0L;
        int n=str.length();
        for(int i=0;i<n;i++) bit^=(1L<<(str.charAt(i)-'A')); 
        bit=Long.bitCount(bit);
        return n-(int)(bit==0?0:bit-1);
    }
}