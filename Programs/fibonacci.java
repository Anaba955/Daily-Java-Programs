//https://www.naukri.com/code360/problems/print-fibonacci-series_7410103?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM

public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        int fib[] = new int[n];
        fib[0] = 0;
        if(n == 1)  return fib;
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
}
