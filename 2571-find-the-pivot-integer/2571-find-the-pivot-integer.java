class Solution {
    public int pivotInteger(int n) {
       int leftsum=0;
       int rightsum=0;
       for(int i=1;i<=n;i++){
        rightsum+=i;
       }
       for(int i=1;i<=n;i++){
        int val=i;
        rightsum-=val;
        if(leftsum==rightsum){
            return val;
        }
        leftsum+=val;
       }
       return -1;
    }
}