/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.*/

import java.io.*;
import java.math.*;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0, rightSum = 0, index = 0, n = arr.size();
        while(index < n) {
            leftSum += arr.get(index).get(index);
            index++;
        }
        index = 0;
        while(index < n) {
            rightSum += arr.get(index).get(n - 1 - index);
            index++;
        }
        return Math.abs(leftSum - rightSum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
