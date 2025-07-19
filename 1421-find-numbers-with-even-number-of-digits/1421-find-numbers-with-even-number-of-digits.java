class Solution {
    public int findNumbers(int[] nums) {
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){ 
            int n = nums[i];
            while(n>0){
                c1++;
                n/=10;
            }
            if(c1%2==0){
                c2++;
            }
            c1=0;
        }
        return c2;
    }
}