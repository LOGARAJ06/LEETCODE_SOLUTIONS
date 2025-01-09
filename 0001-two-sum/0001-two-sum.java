public class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return new int[]{i,j};
            }
            sum = 0;
            }
        }
        return new int[]{-1,-1};
    }
}