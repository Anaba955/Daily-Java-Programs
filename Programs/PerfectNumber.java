import java.util.*;
public class Main
{
    public static void isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0)
                sum += i;
        }
        if(sum == n)    System.out.print(n + " ");
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt(), end = sc.nextInt();
		int sum = 0;
		for(int i = start; i <= end; i++) {
		    isPerfect(i);
		}
	}
}
