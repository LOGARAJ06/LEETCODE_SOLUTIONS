class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int counter = 1;
        while(num>counter){
            if(num % counter == 0){
                sum+=counter;
            }counter++;
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
}