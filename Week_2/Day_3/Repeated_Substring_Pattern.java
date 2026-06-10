class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d = s + s; // double the string
        String trim = d.substring(1, d.length() - 1);
        return trim.contains(s);
    }
}
