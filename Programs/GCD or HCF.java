//https://www.naukri.com/code360/problems/gcd-or-hcf_10870939?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class Solution {
    public static int calcGCD(int n, int m){
        // if(n % m == 0)    return m;
        // int gcd = 0;
        // for(int i = 1; i <= m; i++) {
        //     if((n % i == 0) && (m % i == 0))    gcd = i;
        // }
        // return gcd;

        if(n == 0)  return m;
        if(m == 0)  return n;
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
