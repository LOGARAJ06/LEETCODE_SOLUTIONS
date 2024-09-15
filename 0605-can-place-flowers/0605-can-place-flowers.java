class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int c=0;
        for(int i=0;i<fb.length;i++){
            int prev=6,next=6;
            if(fb[i]==0){
                if(i==fb.length-1){
                    next=0;
                }else{
                    next=fb[i+1];
                }
                if(i==0){
                    prev=0;
                }else{
                    prev=fb[i-1];
                }
            if(next==0&&prev==0){
                fb[i]=1;
                c++;
            }
        }
    }
        if(c>=n){
            return true;
        }else{
            return false;
        }

    }
}