import java.util.*;
public class Main
{
    public static void maxDigit(int n) {
        int max = Integer.MIN_VALUE;
        while(n > 0) {
            if(n % 10 > max)    max = n % 10;
            n /= 10;
        }
        System.out.print(max);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		maxDigit(n);
	}
}
