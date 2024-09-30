//Return array with numbers from 1 to x without using loops

public class Solution {
    public static int[] printNos(int x) {
        int[] a = new int[x];
        initialize(a, x);
        return a;
    }
    public static void initialize(int[] a, int x) {//1
        if(x == 1)  
            a[0] = 1;
        else {
            int y = x;
            a[--x] = y;
            initialize(a, x);
        } 
    }
}
