import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++){
        try{
                    long x=sc.nextLong();
                    System.out.println(x+" can be fitted in:");
                    if(x>=-128 && x<=127)System.out.print("* byte");
                    
                    if(x>=-32768 && x<=32767)System.out.println("* short");
                    
      if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                    
     if(x>=Math.pow(-2,63) && x<=Math.pow(2,63)-1)System.out.println("* long");
                    
        }
        catch(Exception e){
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }
        }
        
        ////
    }
}
