			//	ANAGRAM

// Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string.
//In other words, we can say that two strings are anagrams if they contain the same characters but in a different order.

	// ex LISTEN - > SILENT

	//HEART - > EARTH

	//LIVES - > ELVIS

	//KEEP -> PEEK

	//TABLE - >BLEAT



import java.util.Scanner;
public class Anagram
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        
        boolean isAnagram=false;
        
        boolean visited[]=new boolean[b.length()];
        
        if(a.length() == b.length())
        {
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            isAnagram=false;
            
            for(int j=0;j<b.length();j++)
            {
                if(b.charAt(j) == c & !visited[j])
                {   
                    visited[j]=true;
                    isAnagram=true;
                    break;
                }
            }
            if(!isAnagram)
            {
                break;
            }
        }
        }
        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("not Anagram");
        }
    }
}