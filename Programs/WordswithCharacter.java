// https://leetcode.com/problems/find-words-containing-character/description/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x)))    indices.add(i);  // .indexOf(x) can be used
        }
        return indices;
    }
}
