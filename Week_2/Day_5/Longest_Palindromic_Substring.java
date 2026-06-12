class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 1;
        for(int i = 0; i < s.length(); i++){

            int len1 = exp(s, i, i); // odd length
            int len2 = exp(s, i, i + 1); // even length

            int best = Math.max(len1, len2);

            if(best > maxLen){
                maxLen = best;
                start = i - (best - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    private int exp(String s, int l, int r) {
        while (l >= 0 && r < s.length()
               && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
