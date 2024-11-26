class Solution {
    public int maxSubArray(int[] nums) {
         int maximum=nums[0];
        int currmax=nums[0];
        for(int i=1;i<nums.length;i++){
            currmax = Math.max(nums[i],nums[i]+currmax);
            maximum = Math.max(currmax,maximum);
        }
        return maximum;

    }
}
        
