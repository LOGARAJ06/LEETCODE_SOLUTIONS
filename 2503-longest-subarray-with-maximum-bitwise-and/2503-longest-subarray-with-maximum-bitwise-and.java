class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int cc=0;
        int mc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                cc++;
            }else{
                if(cc>mc){
                    mc=cc;
                }
                cc=0;
            }
        }
        if(cc>mc){
            mc=cc;
        }
        return mc;
    }
}