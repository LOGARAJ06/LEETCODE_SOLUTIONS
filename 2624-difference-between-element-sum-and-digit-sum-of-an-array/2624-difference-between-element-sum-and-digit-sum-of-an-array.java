class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum=0;
        int digitSum=0;

        for(int num:nums){
            sum+=num;

            while(num>0){
                int digit=num%10;
                digitSum+=digit;
                num/=10;
            }

        }

        return sum-digitSum;
    }
}