class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len = Math.min(Math.min(s1.length(),s2.length()),s3.length());
        int index = 0;
        for(int i=0; i<len; i++){
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                index++;
            }else{
                break;
            }
        }
        int ans = -1;
        if(index > 0)
            ans = (s1.length()-index) + (s2.length()-index) + (s3.length()-index);
        return ans;
    }
}