class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0,maxsum = 0,minsum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        if(sum>maxsum)  maxsum=sum;
        if(sum<minsum)  minsum=sum;
        }
        return Math.abs(maxsum-minsum);
    }
}