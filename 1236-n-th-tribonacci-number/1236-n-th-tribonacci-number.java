class Solution {
    public int tribonacci(int n) {
       int[] arr = {0,1,1};
       if(n<=2){
        return arr[n];
       }
       for(int i=3;i<=n;i++){
        int temp=arr[0]+arr[1]+arr[2];
        arr[0]=arr[1];
        arr[1]=arr[2];
        arr[2]=temp;
       }
       return arr[2];
    }
}