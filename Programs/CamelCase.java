// Camel Case is a naming style common in many programming languages. 
// In Java, method and variable names typically start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread). Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).
//Your task is to write a program that creates or splits Camel Case variable, method, and class names.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter(";");
       while(sc.hasNextLine()) {
           String input = sc.nextLine();
            String[] parts = input.split(";");
            String op = parts[0];
            String type = parts[1];
        StringBuilder text = new StringBuilder(parts[2]);
        StringBuilder f = new StringBuilder("");
        if(type.equals("M")) {
            if(op.equals("S")) {
                for(int i=0; i<text.length()-2; i++) {
                    if((int)(text.charAt(i))<=90) {
                        char ch = (char)((int)(text.charAt(i))+32);
                        text.setCharAt(i, ch);
                        f.append(" ");
                    }
                    f.append(text.charAt(i));
                }
            } else {
                for(int i=0; i<text.length(); i++) {
                    if(text.charAt(i) == ' ') {
                        char ch = (char)((int)(text.charAt(i+1))-32);
                        text.setCharAt(i+1, ch);
                        continue;
                    }
                    f.append(text.charAt(i));
                }
                f.append("()");
            }
        } 
        else if(type.equals("V")) {
            if(op.equals("S")) {
                for(int i=0; i<text.length(); i++) {
                    if((int)(text.charAt(i)) <= 90) {
                        char ch = (char)((int)(text.charAt(i))+32);
                        text.setCharAt(i, ch);
                        f.append(" ");
                    }
                    f.append(text.charAt(i));
                }
            } else {
                for(int i=0; i<text.length(); i++) {
                    if(text.charAt(i) == ' ') {
                        char ch = (char)((int)(text.charAt(i+1))-32);
                        text.setCharAt(i+1, ch);
                        continue;
                    }
                    f.append(text.charAt(i));
                }
            }
        } 
        else {
                if(op.equals("S")) {
                for(int i=0; i<text.length(); i++) {
                    if((int)(text.charAt(i))<=90) {
                        char ch = (char)((int)(text.charAt(i))+32);
                        text.setCharAt(i, ch); 
                        if(i!=0)                      
                            f.append(" ");
                    }
                    f.append(text.charAt(i));
                }
            } else {
                char ch = (char)((int)(text.charAt(0))-32);
                    f.append(ch);
                for(int i=1; i<text.length(); i++) {
                    if(text.charAt(i) == ' ') {
                        ch = (char)((int)(text.charAt(i+1))-32);
                        text.setCharAt(i+1, ch);
                        continue;
                    }
                    f.append(text.charAt(i));
                }
            }
        }
        System.out.println(f);
        }
        sc.close();
    }
}
