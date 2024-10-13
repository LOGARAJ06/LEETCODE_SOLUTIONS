class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length ; i++)
        {
            if (arr[i] == 0 && i+1 < length)
            {
                for (int j = length - 1; j > i+1; j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}