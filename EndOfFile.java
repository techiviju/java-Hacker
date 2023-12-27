//Java End -of-file

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(sc.hasNext())
        {
            System.out.println(n++ +" "+sc.nextLine());
            
        }
        sc.close();
    }
}

/*	hasNext() method is used to check whether there is any element remaining in the List. 
	This method is a boolean type method that returns only true and false as discussed as
	it is just used for checking purposes. The hasNext() methods of the Iterator and List 
	Iterator returns true if the collection object over which is used to check during traversal 
	whether the pointing element has the next element. If not it simply returns false.

*/