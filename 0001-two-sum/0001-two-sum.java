public class Solution {
    public int[] twoSum(int[] arr, int target) {
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            sum = arr[i]+arr[j];
            if(sum == target){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{0,0};
    }
}