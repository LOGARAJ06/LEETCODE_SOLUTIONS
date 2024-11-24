class Solution {
    public int countGoodSubstrings(String s) {
        int c = 0;
        char[] a = s.toCharArray();
        for (int i = 0; i <= a.length - 3; ++i) {
            if (a[i] != a[i + 1] && a[i] != a[i + 2] && a[i + 1] != a[i + 2])
                ++c;
        }
        return c;
    }
}