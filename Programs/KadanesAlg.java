class Solution {

    int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            //Decide whether to add the current element to the existing subarray or start a new subarray with the current element
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            //Keep track of max sum found till now
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
  
}
