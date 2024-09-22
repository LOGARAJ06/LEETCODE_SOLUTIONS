class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int counter=1;counter<num;counter++){
            if(num % counter == 0){
                sum+=counter;
            }
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
}