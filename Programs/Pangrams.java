/*A pangram is a string that contains every letter of the alphabet. 
Given a sentence determine whether it is a pangram in the English alphabet. 
Ignore case. Return either pangram or not pangram as appropriate.

Example
s = 'The quick brown box jumps over the lazy dog'
The string contains all letters in the English alphabet, so return pangram.
*/

class Result {
  
    public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> alphabet = new HashSet<>();
        for(char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        for(char ch : s.toCharArray()) { //converts string to char array
            alphabet.remove(ch);
        }
        if(alphabet.isEmpty())  return "pangram";
        else    return "not pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
