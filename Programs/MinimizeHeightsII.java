https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351

class Solution {
    int getMinDiff(int[] arr, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int n = arr.length;
        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] < k)  
                continue;
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i-1] + k, arr[n - 1] - k);
            
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
