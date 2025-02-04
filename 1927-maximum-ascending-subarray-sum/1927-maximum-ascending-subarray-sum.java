public class Solution {

    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currentSubarraySum = nums[0];

        for (int currentIdx = 1; currentIdx < nums.length; ++currentIdx) {
            if (nums[currentIdx] <= nums[currentIdx - 1]) {
                maxSum = Math.max(maxSum, currentSubarraySum);
                currentSubarraySum = 0;
            }
            currentSubarraySum += nums[currentIdx];
        }
        return Math.max(maxSum, currentSubarraySum);
    }
}