class Solution {
    public int getSecondLargest(int[] a) {
        int max = a[0], second = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max){
                second = max;
                max = a[i];
            }
            if(a[i] > second && a[i] != max) second = a[i];
        }
        return second;
    }
}
