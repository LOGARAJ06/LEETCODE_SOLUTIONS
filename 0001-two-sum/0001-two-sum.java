public class Solution {
    public int[] twoSum(int[] arr, int target) {
        int sub = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            sub = target-arr[i];
            if(map.containsKey(sub)){
                return new int[]{map.get(sub),i}; 
            }
            map.put(arr[i],i);
        }
        return null;
    }
}