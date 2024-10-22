class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            product = product * temp;
            sum = sum + temp;
            n = n / 10;
        }
        return product - sum;
    }
}