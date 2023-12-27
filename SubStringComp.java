
	// Substring comparison by lexical 
		// this is a wrong ans for hacker // correct ans in below

/*
import java.io.*;
import java.util.*;

public class SubStringComp{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        
        System.out.println(s.substring(s.length() -n));  // print end String 
        System.out.println(s.substring(0,n)); //starting string 
    }
}

*/

			//	CORRECT 	//

import java.io.*;
import java.util.*;
public class Solution
{   
    public static String getSmallAndLarge(String s,int n)
    {

//These lines declare two empty strings (smallest and largest) to store the lexicographically smallest and largest substrings.

    String smallest="";
    String largest="";
    
	// These lines initialize smallest and largest with the first substring of length k from the input string s.

    smallest=s.substring(0,n);
    largest=s.substring(0,n);
    
            // Initialize smallest and largest with the first substring of length n
	//This line starts a for loop that iterates through the string, starting from the second substring of length n

    for(int i=1;i<=s.length()-n;i++)
    {
	//Inside the loop, a substring variable is assigned the value of the current substring of length k within the loop.

        String substring =s.substring(i, i+n);

	//This condition checks if the current substring is lexicographically smaller than the current value of smallest. If true, it updates smallest with the current substring.

        if(substring.compareTo(smallest)<0)
        {
            smallest=substring;
        }
        if(substring.compareTo(largest)>0)
        {
            largest=substring;
        }
    
    }
	// The method returns a string that concatenates the lexicographically smallest and largest substrings, separated by a newline character (\n).

            return smallest + "\n" +largest;
}

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=sc.nextInt();
    
    sc.close();
    
    String result=getSmallAndLarge(s,n);
    System.out.println(result);
    }
}


				// SECOND CORRECT 
/*

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0,k);
        String maxSubstring = line.substring(0,k);
        for (int i = 1; i < line.length()-k+1; i++) {
            String sub = line.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }
}
*/

/*
							THIRD

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 64 * 1024);

        final String S = br.readLine().trim();
        final int K = Integer.parseInt(br.readLine().trim(), 10);
        final int len = S.length() - K + 1;
        final String[] A = new String[len];
        for (int i = 0; i < len; i++) {
            A[i] = S.substring(i, i + K);
        }
        Arrays.sort(A);
        System.out.println(A[0]);
        System.out.println(A[len - 1]);

        br.close();
        br = null;
    }
}
*/