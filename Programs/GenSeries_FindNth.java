/*Given three numbers, a, b and c, such that either a < b < c or a > b > c and a, b and c can be positive, negative or zero. 
Form the series such that the gp between c and it's next element (say d) should be the same as gap between a and b. 
Similarly, the gap between c's next element(d) and d's next element (say e) should be same as the gap between b and c.
Find and return the Nth element.*/

class UserMainCode {
  public int seriesN(int input1, int input2, int input3, int input4) {
    int arr[] = new int[input4];
    arr[0] = input1;
    arr[1] = input2;
    arr[2] = input3;
    for(int i = 3; i < input4; i++) {
      int gap = arr[i - 2] - arr[i - 3];
      arr[i] = arr[i - 1] + gap;
    }
    return arr[input4 - 1];
  }
}
