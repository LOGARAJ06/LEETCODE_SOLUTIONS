class Solution {
    public void duplicateZeros(int[] arr) {
       int n = arr.length;
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If a zero is encountered
            if (arr[i] == 0) {
                // Shift elements to the right, starting from the end
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // Duplicate the zero by setting the next element to zero
                i++;  // Skip over the next position as it contains the duplicated zero
            }
        }
    }
}