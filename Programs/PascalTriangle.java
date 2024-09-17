class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            arr.add(new ArrayList<>());
        }
        arr.get(0).add(1);
        int middleValue = 0;
        for(int i = 1; i < numRows; i++) {
            arr.get(i).add(1);
            for(int j = 1; j < i; j++) {
                middleValue = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                arr.get(i).add(middleValue);
            }
            arr.get(i).add(1);
        }
        return arr;
    }
}
