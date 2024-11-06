class Solution {
    public int maxPower(String s) {
        int power=1;
        int c=' ';
        int pow=0;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==c){
                power++;
            }else
                power=1;
            c=c1;
            pow=Math.max(pow,power);
            
        }
        return pow;
    }
}