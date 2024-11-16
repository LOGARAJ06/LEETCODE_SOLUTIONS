class Solution {
    public int numberOfSpecialChars(String s) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') arr1[ch-'a']++;
            else arr2[ch-'A']++;
        }
        
        int ans = 0;
        
        for(int i=0; i<26; i++){
            if(arr1[i]>0 && arr2[i]>0) ans++;
        }
        return ans;
    }
}