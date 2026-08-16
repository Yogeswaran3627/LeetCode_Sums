class Solution {
    public int numSteps(String s) {
        int count = 0;
        while (!s.equals("1")) {
            if (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1);
            } else {
                int i = s.length() - 1;
                char[] arr = s.toCharArray();
                while (i >= 0 && arr[i] == '1') {
                    arr[i] = '0';
                    i--;
                }
                if (i >= 0) {
                    arr[i] = '1';
                } else {
                    s = "1" + new String(arr);
                    count++;
                    continue;
                }
                s = new String(arr);
            }
            count++;
        }
        return count;
    }
}