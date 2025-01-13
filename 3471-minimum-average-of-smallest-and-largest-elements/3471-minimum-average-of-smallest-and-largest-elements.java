class Solution {
    public double minimumAverage(int[] nums) {
        
        int left =0;
        int right =nums.length-1;
        double min = Double.MAX_VALUE;
        Arrays.sort(nums);
        
        while(left<=right){
            
            double avg = nums[left]+ nums[right];
            
            avg = avg/2;
            
            min = Math.min(avg,min);  
            left++;
            right--;
            
            
        }
        return min;
    }
}