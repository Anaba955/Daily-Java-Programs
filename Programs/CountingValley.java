/*
An avid hiker keeps meticulous records of their hikes. 
During the last hike that took exactly 'steps' steps, for every step it was noted if it was an uphill, U, or a downhill, D step.
Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. 
We define the following terms:
# A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
# A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
*/
class Result {
    public static int countingValleys(int steps, String path) {
        int altitude = 0, valley = 0;
        for(int i = 0; i < path.length(); i++) {
            if(altitude == 0 & path.charAt(i) == 'D')   valley++;
            if(path.charAt(i) == 'D')  altitude--;
            else    altitude++;
        }
        return valley;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
