class Solution {
    public int reverse(int x) {
        Boolean flag = true;
        if(x<0){
            flag = false;
        }
        long rev = 0;
        x = Math.abs(x);
        while(x>0){
            rev = (rev*10) + (x%10);
            x/=10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
                return 0;
        }
        if(!flag)
            return -1*(int)rev;
        return (int)rev;
    }
}