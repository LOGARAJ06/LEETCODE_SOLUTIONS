class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char a = arr[i];
            if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                list.add(a);
                arr[i] = '\0'; 

            }
        }
        int len = list.size() - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '\0') {
                arr[i] = list.get(len);
                len--;
            }}
        String str = new String(arr);
        return str;
    }
}