https://www.naukri.com/code360/problems/check-prime_624934?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class Solution {
	public static String isPrime(int num) {
		if(num <= 1){
			return "NO";
		};
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0){
				return "NO";
			}
		}
		return "YES";
	}
}
