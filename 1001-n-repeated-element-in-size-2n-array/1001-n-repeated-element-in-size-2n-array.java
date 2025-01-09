class Solution {
    public int repeatedNTimes(int[] nums) {
        //Hashtable<Integer,Integer> hs = new Hashtable<>();
        int ct = 1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                ct++;
                if(ct>1){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}