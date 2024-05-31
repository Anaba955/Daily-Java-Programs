/* A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
Given the signal received by Earth as a string, s, determine how many letters of the SOS message have been changed by radiation.
Example
s = "SOSTOT"
The original message was SOSSOS. Two of the message's characters were changed in transit.
*/

class Result {
    public static int marsExploration(String s) {
        int change = 0;
        for(int i=0; i<s.length()-2; i+=3) {
            System.out.println(i);
            if(s.substring(i, i+3) != "SOS"){
                if(s.charAt(i) != 'S')  change++;
                if(s.charAt(i+1) != 'O')    change++;
                if(s.charAt(i+2) != 'S')    change++;
            }
            
        }
      
//Alternative way (Smarter one)
        String originalString = "SOS";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != originalString.charAt(i % 3))
                change++;
        }
        return change;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
