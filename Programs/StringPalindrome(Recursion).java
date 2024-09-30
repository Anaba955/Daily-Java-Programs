//https://www.naukri.com/code360/problems/check-palindrome-recursive_10871902?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav

public class Solution {
    public static boolean isPalindrome(String str) {
        return checkPalindrome(str, 0, str.length() - 1);
    }
    
    public static boolean checkPalindrome(String str, int start, int end) {
        if(start >= end)
            return true;
        else if(str.charAt(start) != str.charAt(end))
            return false;
        else return checkPalindrome(str, start+1, end-1);
    }
}
