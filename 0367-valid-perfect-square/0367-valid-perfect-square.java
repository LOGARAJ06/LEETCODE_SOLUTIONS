class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int left=1;
        int right=num/2;
        while(left<=right){
            int mid = (left+right)/2;
            long sq = (long)mid*mid;

            if(sq==num){
                return true;
            }else if(sq > num){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}