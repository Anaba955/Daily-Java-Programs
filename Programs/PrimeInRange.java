import java.util.*;
public class Main
{
    public static boolean Prime(int n) {
        if(n == 1)  return false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0)  return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt(), end = sc.nextInt();
		for(int i = start; i <= end; i++){
		    if(Prime(i))    System.out.print(i+ " ");
		}
	}
}
