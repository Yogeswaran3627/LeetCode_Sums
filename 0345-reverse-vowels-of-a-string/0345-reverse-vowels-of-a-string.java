class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int r = chars.length - 1;
        int l = 0;
        while (l < r) {
            if (!isVowel(chars[l])) {
                l++;
            } else if (!isVowel(chars[r])) {
                r--;
            } else {
                char t = chars[r];
                chars[r] = chars[l];
                chars[l] = t;
                l++;
                r--;
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}