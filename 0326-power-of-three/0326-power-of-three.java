class Solution {
    public boolean isPowerOfThree(int n) {
        int i=1;
        if(n==-1 || n==0){
            return false;
        }
        while(true){
            int a=3*i;
            if(i==n)
            {
                return true;
        
            }
            if(i>n/2){
                return false;
            }

            i=a;
        }
    }
}