//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote
class Solution {
    public List<Integer> findMajority(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int limit = nums.length / 3;
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > limit) list.add(entry.getKey());  
        }
        return list;
    }
}
