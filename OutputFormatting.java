import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        String s1=sc.next();
        int n1=sc.nextInt();
        
        String s2=sc.next();
        int n2=sc.nextInt();
        
        String s3=sc.next();
        int n3=sc.nextInt();
        System.out.println("================================");
        
        System.out.println(String.format("%-15s%03d",s1,n1));
        
        System.out.println(String.format("%-15s%03d",s2,n2));
        
        System.out.println(String.format("%-15s%03d",s3,n3));
         System.out.println("================================");

    }
}
