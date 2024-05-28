/*The counting sort, does not require comparison. 
Instead, you create an integer array whose index range covers the entire range of values in your array to sort. 
Each time a value occurs in the original array, you increment the counter at that index. 
At the end, run through your counting array, printing the value of each non-zero valued index that number of times.
Given a list of integers, count and return the number of times each value appears as an array of integers.*/

class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
        for(int i = 0; i < arr.size(); i++) {
            result.set(arr.get(i), result.get(arr.get(i)) + 1);
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
