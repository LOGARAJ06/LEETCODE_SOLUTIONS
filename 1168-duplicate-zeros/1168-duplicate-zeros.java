class Solution {
    public void duplicateZeros(int[] arr) {
       int[] temp = new int[arr.length];
        int p =0;
        int i=0;
        boolean flag=false;
        for (int k=0; k<arr.length;k++ )
        {
            temp [k]=arr[k];
        }
          while(i<arr.length)
        {
        
            if (temp [p]==0){
            arr[i]=0;
               if (i+1<arr.length){
                     arr[i+1]=0; 
                     i++;
                      p++;  
                
               }
            }
            else{
                arr[i]=temp[p];
                p++;
            }
            i++;
        }          
    }
}