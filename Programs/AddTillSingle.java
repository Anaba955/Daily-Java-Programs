import java.util.*;
public class Main
{
    public static void Single(int n) {
        int sum;
        while(n > 9) {
            sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.print(n);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Single(n);
	}
}
