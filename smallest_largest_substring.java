/*
Given a string, s, and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length k. 

Sample Input 0
welcometojava
3
Sample Output 0
ava
wel

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        String high=s.substring(0,k);
        String low=s.substring(0,k);
        String a1,a2;
        int res;
        int i=0,j;
        for(j=k;j<=s.length();j++)
        {
         a1=s.substring(i,j);
            res=a1.compareTo(low);
        if(res<0)
            low=a1;
            i++;
        }
        i=0;
        j=0;
        res=0;
        for(j=k;j<=s.length();j++)
        {
         a2=s.substring(i,j);
            res=a2.compareTo(high);
        if(res>0)
            high=a2;
            i++;
        }
           System.out.println(low);
        System.out.println(high);
     }
}