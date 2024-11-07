class Solution {
    public char shift(char c,int i){
        return (char)((int)c+i);
    }
    public String replaceDigits(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                ans += shift(s.charAt(i-1),s.charAt(i)-'0');
            }else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}