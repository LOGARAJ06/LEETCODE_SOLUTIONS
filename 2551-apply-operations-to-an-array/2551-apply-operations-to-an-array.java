class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Apply the operation as per the condition
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
                i++; // skip the next element since it's already processed
            }
        }

        // Step 2: Move all non-zero elements to the front
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                result[index++] = nums[i];
            }
        }

        return result;
    }
}
