/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        char[] r = new char[c1.length + c2.length];

        int i = 0, j = 0, k = 0;
        while(i < c1.length && j < c2.length) {
            r[k++] = c1[i++];
            r[k++] = c2[j++];
        }

        while(i < c1.length) r[k++] = c1[i++];
        while(j < c2.length) r[k++] = c2[j++];

        return new String(r);

    }
}
