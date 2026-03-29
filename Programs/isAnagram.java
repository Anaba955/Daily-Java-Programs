/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
