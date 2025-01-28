class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int total=0;
        int left=0,right=0;
        int[] arr=new int[nums.length];
       
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i-1>=0)
            {
                left+=nums[i-1];
            }
            right=total-left-nums[i]; 
            arr[i]=(int)Math.abs(left-right);
        }
        return arr;
    }
} 