//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621
class Solution {
    static void rotateArr(int arr[], int d) {
        d %= arr.length; //Handles cases for d > arr.length
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, arr.length-1);
        reverseArr(arr, 0, arr.length-1);
    }
    
    static void reverseArr(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
