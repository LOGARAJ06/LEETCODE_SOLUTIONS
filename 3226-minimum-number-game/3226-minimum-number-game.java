class Solution 
{
    public int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l;)
        {
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
            i=i+2;
        }
        return nums;
    }
}