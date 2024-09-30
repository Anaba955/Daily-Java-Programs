//https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class Solution {
    public static int isSorted(int n, int []a) {
        for(int i = 0; i < n-1; i++) {
            if(a[i] > a[i+1]) return 0; 
        }
        return 1;
    }
}
