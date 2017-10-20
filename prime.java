/*
Sample Input
13
Sample Output
prime
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
       if(n.isProbablePrime(3))
           System.out.println("prime");
       else
           System.out.println("not prime");
      in.close();

   }
}
