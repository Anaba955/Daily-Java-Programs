import java.util.*;
public class Main
{
    public static int length(int n) {
        int count  = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static boolean armstrong(int n, int power) {
        int sum = 0, p = n;
        while(n != 0) {
            sum += Math.pow(n%10, power);
            n /= 10;
        }
        return p == sum;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt(), end = sc.nextInt();
	    int len = 0;
	    for(int i = start; i <= end; i++) {
	        len = length(i);
	        if(armstrong(i, len)) {
	            System.out.print(i + " ");
	        } 
	    }
	}
}
