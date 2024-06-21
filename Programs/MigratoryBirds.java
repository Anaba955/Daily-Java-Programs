/*Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. 
If more than 1 type has been spotted that maximum amount, return the smallest of their ids.*/

class Result {

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> bird_count = new HashMap<>();
        
        for(int i = 0; i < arr.size(); i++) {
            if(bird_count.containsKey(arr.get(i))) {
                bird_count.put(arr.get(i), bird_count.get(arr.get(i)) + 1);
            } else {
                bird_count.put(arr.get(i), 1);
            }
        }
        
        int max=0, id = -1;
        for(Integer key: bird_count.keySet()) {
            if(bird_count.get(key) > max) {
                max = bird_count.get(key);
                id = key;
            }
            if(bird_count.get(key) == max) {
                id = key > id ? id : key;
            }
        }
        return id;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
