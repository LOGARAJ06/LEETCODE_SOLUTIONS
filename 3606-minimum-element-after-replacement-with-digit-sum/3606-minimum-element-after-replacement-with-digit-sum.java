class Solution {
    public int minElement(int[] nums) {
     int a = 0;
    int num =0;
    int temp =0;

   int min =Integer.MAX_VALUE; 
        Arrays.sort(nums);
       for(int i =0 ; i<nums.length ; i++){
           num =  nums[i];
          while(num>0){
             temp = num%10;
              a+=temp;
              num/=10;
          }
            min = Math.min(min,a);
            a=0;
       }

       return min;
    }
}