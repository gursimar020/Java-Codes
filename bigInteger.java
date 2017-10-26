/*
Sample Input
1234
20

Sample Output
1254
24680

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger b1 = new BigInteger(scan.next());
        BigInteger b2 = new BigInteger(scan.next());
        BigInteger b3,b4;
        b3=b1.add(b2);
        b4=b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
            

    }
}