import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      
      int c,v;
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      sc.nextLine();
      while(T-- >0){
        c=0;
        v=0;
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='I'
        ||str.charAt(i)=='o'||
        str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
          v++; 
        }
        else  c++;
      }
      System.out.println(v+" "+c);  
      }
      
    }
  }
