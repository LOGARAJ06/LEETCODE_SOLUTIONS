class Solution {
    public int[] constructRectangle(int area) {
        for(int i=(int)Math.sqrt(area);i>=1;i--)
        {
            if(area%i==0)
            {
                return new int[]{Math.max(i,area/i),Math.min(i,area/i)};
            }
        }
        return new int[]{area,1};
    }
}