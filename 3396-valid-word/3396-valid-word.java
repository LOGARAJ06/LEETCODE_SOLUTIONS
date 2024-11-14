class Solution {
    public boolean isValid(String word) {
        int len=word.length();
        if(len<3)
        {
            return false;
        }
        int count=0,count1=0;
        for(int i=0;i<len;i++)
        {
            char c=word.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            {
                c=Character.toLowerCase(c);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    count++;
                }
                else
                {
                    count1++;
                }
            }
            else if(c>='0' && c<='9')
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return count > 0 && count1 > 0;
    }
}