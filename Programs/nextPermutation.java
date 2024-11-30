//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

class Solution {
    void nextPermutation(int[] arr) {
        int i = arr.length-2;
        for(; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                int min = i+1;
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[min] > arr[j] && arr[j] > arr[i])
                        min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                reverseArr(arr, i+1, arr.length-1);
                break;
            }
        }
        if(i == -1)
            reverseArr(arr, 0, arr.length-1);
    }
    
    void reverseArr(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
