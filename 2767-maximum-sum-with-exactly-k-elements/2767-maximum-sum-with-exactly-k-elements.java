class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += max;
            max++;
        }

        return ans;
    }
}