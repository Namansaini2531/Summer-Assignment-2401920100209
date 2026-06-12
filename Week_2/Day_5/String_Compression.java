class Solution {
    public int compress(char[] chars) {
        int w = 0;  // where to write next
        int r  = 0;  // where to read from

        while (r < chars.length) {
            char curr  = chars[r];
            int  count = 0;

            while (r < chars.length && chars[r] == curr) {
                r++;
                count++;
            }

            chars[w++] = curr;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()){
                    chars[w++] = c;
                }
            }
        }
        return w;
    }
}
