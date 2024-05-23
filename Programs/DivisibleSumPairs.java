/* Given an array of integers and a positive integer k, determine the number of (i, j) pairs where i < j and ar[i] + ar[j] is divisible by k.
Example
ar = [1, 2, 3, 4, 5, 6]
k = 5
Three pairs meet te criteria: [1, 4], [2, 3], and [4, 6].*/

class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count=0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if((ar.get(i)+ar.get(j)) % k == 0){
                         count++;
                }
            }
        }
        return count;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
