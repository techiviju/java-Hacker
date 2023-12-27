/*There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String secondLine = (A.charAt(0) > B.charAt(0)) ? ("Yes") : ("No");
        System.out.println(secondLine);
        String thirdLine = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(thirdLine);
    }
}

// first latter will be upper case


/* second program 

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    sc.close();
    /* Enter your code here. Print output to STDOUT. */
    int a = A.length()+B.length();
    System.out.println(a);
    int b =A.compareTo(B);
    if(b>0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }        
    System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));


}
}

*/

		///  Third program ////

/* 
	public static void main(String[] args) {
// write your code here
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    System.out.println(A.length() + B.length());
    if(A.compareTo(B) > 0){
        System.out.println("Yes");
    } else
        System.out.println("No");

    System.out.println(StringUtils.capitalize(A)+" "+StringUtils.capitalize(B));
    sc.close();
}
}

*/