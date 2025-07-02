class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap();
        for(int i:nums){
            if(hm.containsKey(i)){
                return true;
            }
            hm.put(i,false);
        }
        return false;
    }
}