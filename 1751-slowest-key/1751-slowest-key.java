class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxD = releaseTimes[0];
        char res = keysPressed.charAt(0);

        for(int i=1; i<releaseTimes.length; i++){
            if(maxD < releaseTimes[i] - releaseTimes[i-1]){
                maxD = releaseTimes[i] - releaseTimes[i-1];
                res = keysPressed.charAt(i);
            }else if(maxD == releaseTimes[i] - releaseTimes[i-1]){
                if(res < keysPressed.charAt(i)){
                    res = keysPressed.charAt(i);
                }
            }
        }
        return res;
    }
}