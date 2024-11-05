
class Solution {
    public int countLargestGroup(int n) {
        int ans=0;
        int max=0;
        int[] t = new int[n+1];
       int[] freq= new int[101];
       freq[0]=-1;//ignoring zero
        for(int i=1; i<=n; i++){
            t[i]=i%10 +t[i/10];
        }
        for(int i=0;i<t.length;i++)
        {
            freq[t[i]]++;
        }
        for(int i:freq){
              if(max<i){
              max=i;
              ans=0;
              }
            if(i==max)
            ans++;
        }
        return ans;
    }
}   