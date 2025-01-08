class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int ct = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                ct++;
            }else if(arr[i-1]==arr[i] || arr[i+1]==arr[i]){
                return false;
            }else if(arr[i-1]>arr[i] && arr[i+1]>arr[i]){
                return false;
            }
        }
        return ct==1?true:false;
    }
}