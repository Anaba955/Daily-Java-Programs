// https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums; i++) {
            count += hm.getOrDefault(nums[i], 0);  // Available like minded guests in the hall
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);  // adding new guest
        }
        return count;
    }
}
