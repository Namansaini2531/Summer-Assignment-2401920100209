
// we use IndexOf() instead of strStr()
// java does not have strStr()
// the java alternative is indexOf()

class Solution {
    public int strStr(String haystack, String needle) {
        int x = haystack.indexOf(needle);
        return x;
    }
}
