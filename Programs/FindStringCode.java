/*Given an input string, return the sum of difference of the first letter and last letter, second letter and preultimate letter and so on of each word in the String.*/

class Result {
    public int findStringCode(String input1) {
      Map<Character, Integer> letters = new HashMap<>();
      String[] words = input1.split(" ");
      int sum = 0;
      String concatenatedString = "";
      for(int i = 65, value = 1, i <= 90; i++, value++) {
        letters.put((char)i, value);
      }
      for(String word : words) {
        word = word.toUpperCase();
        int n = word.length()/2;
        for(int i = 0; i < n; i++) {
          sum += Math.abs(letter.get(word.charAt(i)) - letter.get(word.charAt(word.length()-i-1)));
        }
        if(word.length() % 2 != 0)  sum += word.charAt(n);
        concatenatedSum += String.valueOf(sum);
      }
      return Integer.parseInt(conatenatedSum);  
  }
}
