/*Get pin by first adding length of words in given string then get a single numeric digit by ading the digits of sum */

class UserMainCode {
  public int getCodeThroughStrings(String input1) {
    String[] words = input1.split(" ");
    int sum = 0, pin = 0;
    for(String word : words) {
      sum += word.length();
    }
    while(sum > 0) {
      pin += sum % 10;
      sum /= 10;
    }
    pin += sum;
    return pin;
  }
}
