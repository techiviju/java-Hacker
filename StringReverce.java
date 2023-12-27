		// String Reverce Hacker rank

import java.util.*;

public class StringReverce
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        boolean isPalindro=true;
        int length=s.length();
        
        for(int i=0;i<length/2;i++)
        {
            if(s.charAt(i) != s.charAt(length - i - 1))
            {
                isPalindro=false;
                break;
            }
            
        }
        if(isPalindro)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}

/*			// 2nd step 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}


			//  3 rd


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
        
    }
}

*/