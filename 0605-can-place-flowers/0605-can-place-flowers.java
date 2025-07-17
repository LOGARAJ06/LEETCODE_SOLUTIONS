class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int i=0;
        while(i<fb.length && n>0){
            if(fb[i]==1){
                i+=2;
            }
            else if(i==fb.length-1 ||fb[i+1]==0 ){
                n--;
                i+=2;
            }else {
                i+=3;
            }
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}