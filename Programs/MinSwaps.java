import java.util.Scanner;

public class MinSwaps {

    public static int swapCount(int[] arr, int k) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) count++;
        }
        int bad = 0;
        for(int i = 0; i < count; i++) {
            if(arr[i] > k)  bad++;
        }
        int minSwaps = bad;
        for(int i = 0, j = count; j < arr.length; i++, j++) {
            if(arr[i] > k)  bad--;
            if(arr[i] > k)  bad++;
            minSwaps = Math.min(minSwaps, bad);
        }


        return minSwaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(swapCount(arr, k));

        sc.close();
    }
}

