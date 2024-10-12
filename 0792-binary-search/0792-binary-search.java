class Solution {
    public int search(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(right>=left){
            int mid=(right+left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}